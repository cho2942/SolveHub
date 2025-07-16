package org.example.kakao_mobility;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public String solution(String S, String C) {

        if(S.isEmpty()){
            return "";
        }

        String[] splitInput = S.split(", ");

        Map<String, Integer> map = new HashMap<>();
        String address = "@" + C.toLowerCase() + ".com";

        StringBuilder answer = new StringBuilder();

        for (String name : splitInput) {
            String[] splitName = name.split(" ");
            String email = "";

            if (splitName.length == 2) { // middle 없음
                int lastnameLength = Math.min(8, splitName[1].length());

                String firstName = splitName[0].toLowerCase();
                String lastname = splitName[1].replaceAll("-", "").substring(0, lastnameLength).toLowerCase();

                email = String.valueOf(firstName.charAt(0)) + lastname;

            } else if (splitName.length == 3) {  // middle 있음
                int lastnameLength = Math.min(8, splitName[2].length());

                String firstName = splitName[0].toLowerCase();
                String middleName = splitName[1].toLowerCase();
                String lastname = splitName[2].replaceAll("-", "").substring(0, lastnameLength).toLowerCase();

                email = String.valueOf(firstName.charAt(0)) + String.valueOf(middleName.charAt(0)) + lastname;
            }

            if(map.containsKey(email)){
                int count = map.get(email);
                map.put(email, count + 1);
                email = email + (count + 1) + address;
            }else{
                map.put(email, 1);
                email = email + address;
            }

            answer.append(name).append(" ")
                    .append("<").append(email).append(">")
                    .append(", ");
        }

        return answer.delete(answer.length()-2, answer.length()).toString();
    }
}

// 각 부분 영어 대소문자  first / middle (optional) / last
// 성은 하이픈 포함 가능
// 회사이름 영문
// 하이픈 제거
// 성은 8글자 자름

//        John Doe <jdoe@example.com>,
//        Peter Parker <pparker@example.com>,
//        Mary Jane Watson-Parker <mjwatsonpa@example.com>,
//        James Doe <jdoe2@example.com>,
//        John Elvis Doe <jedoe@example.com>,
//        Jane Doe <jdoe3@example.com>,
//        Penny Parker <pparker2@example.com>


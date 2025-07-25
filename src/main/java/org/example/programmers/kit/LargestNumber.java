package org.example.programmers.kit;

import java.util.ArrayList;
import java.util.List;

public class LargestNumber {
    public String solution(int[] numbers) {
        List<String> stringList = new ArrayList<>();
        for(int number : numbers){
            stringList.add(String.valueOf(number));
        }

        stringList.sort((a,b) -> (b+a).compareTo(a+b));

        String str = stringList.stream().reduce((a, b) -> a + b).get();

        if(str.charAt(0) == '0'){
            return "0";
        }

        return str;
    }
}

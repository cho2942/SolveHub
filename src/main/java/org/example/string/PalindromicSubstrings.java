package org.example.string;

public class PalindromicSubstrings {
    public int countSubstrings(String s) {

        if(s.length() == 1){
            return 1;
        }

        if(s.length() == 2){
            if(s.charAt(0) == s.charAt(1)){
                return 3;
            }else{
                return 2;
            }
        }
        int answer = s.length();

        for(int i=1; i<s.length(); i++){

            if(s.charAt(i) == s.charAt(i - 1)){
                int left = i-1;
                int right = i;

                while(left >= 0 && right < s.length()){

                    if(s.charAt(left) != s.charAt(right)){
                        break;
                    }

                    if(left < 0 || right > s.length() - 1){
                        break;
                    }
                    answer++;
                    left--;
                    right++;
                }
            }
            if(i+1 < s.length() && s.charAt(i-1) == s.charAt(i+1)){
                int left = i-1;
                int right = i+1;

                while(left >= 0 && right < s.length()){
                    if(s.charAt(left) != s.charAt(right)){
                        break;
                    }

                    if(left < 0 || right > s.length() - 1){
                        break;
                    }
                    answer++;
                    left--;
                    right++;
                }
            }
        }

        return answer;
    }
}

//Given a string s, return the number of palindromic substrings in it.
//
//A string is a palindrome when it reads the same backward as forward.
//
//A substring is a contiguous sequence of characters within the string.
//
//
//
//        Example 1:
//
//Input: s = "abc"
//Output: 3
//Explanation: Three palindromic strings: "a", "b", "c".
//Example 2:
//
//Input: s = "aaa"
//Output: 6
//Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

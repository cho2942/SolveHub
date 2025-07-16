package org.example.string;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        String answer = "";

        if(s.length() == 1){
            return s;
        }

        if(s.length() == 2){
            if(s.charAt(0) == s.charAt(1)){
                return s;
            }else{
                return s.substring(0, 1);
            }
        }

        int maxLength = 0;

        for(int i=1; i<s.length(); i++){

            if(s.charAt(i) == s.charAt(i - 1)){
                int left = i-1;
                int right = i;

                while(left >= 0 && right < s.length()){

                    if(s.charAt(left) != s.charAt(right)){
                        left++;
                        right--;
                        break;
                    }

                    if(left == 0 || right == s.length() - 1){
                        break;
                    }

                    left--;
                    right++;
                }

                if(right - left + 1 > maxLength){
                    maxLength = right - left + 1;
                    answer = s.substring(left, right+1);
                }
            }
            if(i+1 < s.length() && s.charAt(i-1) == s.charAt(i+1)){
                int left = i-1;
                int right = i+1;

                while(left >= 0 && right < s.length()){
                    if(s.charAt(left) != s.charAt(right)){
                        left++;
                        right--;
                        break;
                    }

                    if(left == 0 || right == s.length() - 1){
                        break;
                    }

                    left--;
                    right++;
                }

                if(right - left + 1 > maxLength){
                    maxLength = right - left + 1;
                    answer = s.substring(left, right+1);
                }
            }
        }

        return answer.isEmpty() ? String.valueOf(s.charAt(0)) : s;
    }
//    "babad" "bab"
}
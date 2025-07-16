package org.example.string.re;

import java.util.Locale;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase(Locale.ROOT);

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while(!(Character.isLetterOrDigit(s.charAt(left)))&&left<right) {
                left++;
            }
            while(!(Character.isLetterOrDigit(s.charAt(right)))&&left<right) {
                right--;
            }
            if(!(s.charAt(left) == s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
//
//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//        Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.


//
//    int left = 0;
//    int right = s.length() - 1;
//
//        while(left < right){
//        while(left<right && !isLetterOrDigit(s.charAt(left))){
//            left++;
//        }
//        while(left<right && !isLetterOrDigit(s.charAt(right))){
//            right--;
//        }
//        if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
//            return false;
//        }
//        left++;
//        right--;
//    }
//        return true;
//}
////    "A man, a plan, a canal: Panama"
//private boolean isLetterOrDigit(char c) {
//    return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isDigit(c);
//}
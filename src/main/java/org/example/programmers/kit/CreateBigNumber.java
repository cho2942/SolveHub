package org.example.programmers.kit;

import java.util.Stack;

public class CreateBigNumber {

    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();

        for(char digit : number.toCharArray()){
            while(!stack.isEmpty() && k > 0 && stack.peek() <digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while(k>0){
            stack.pop();
            k--;
        }

        StringBuilder stringBuilder = new StringBuilder();
        while(!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.reverse().toString();
    }
}

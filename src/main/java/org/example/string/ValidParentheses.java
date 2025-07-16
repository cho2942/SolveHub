package org.example.string;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                if(stack.peek() == '('){
                    stack.pop();
                }else{
                    stack.push(')');
                }
            }else if(s.charAt(i) == '}'){
                if(stack.peek() == '{'){
                    stack.pop();
                }else{
                    stack.push('}');
                }
            }else if(s.charAt(i) == ']'){
                if(stack.peek() == '['){
                    stack.pop();
                }else{
                    stack.push(']');
                }
            }
        }

        return stack.isEmpty();
    }
}

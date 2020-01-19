package com.doubleysoft.alg.leetcode.stack.Stack_20;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author dongyang.yu
 * dongyang.yu@anxincloud.com
 */
public class Stack_ValidParentheses {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        //why char wrapper class is  Character
        Stack<Character> stack = new Stack();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (isLeftChar(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (isRightChar(s.charAt(i))) {
                char top;
                try {
                    top = stack.pop();
                } catch (EmptyStackException e) {
                    return false;
                }
                boolean isMatch = isMatchChar(top, s.charAt(i));
                if (!isMatch) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean isLeftChar(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    private boolean isRightChar(char ch) {
        return ch == ')' || ch == '}' || ch == ']';
    }

    private boolean isMatchChar(char left, char right) {
        return (left == '{' && right == '}') ||
                (left == '(' && right == ')' ||
                        (left == '[') && right == ']');
    }
}

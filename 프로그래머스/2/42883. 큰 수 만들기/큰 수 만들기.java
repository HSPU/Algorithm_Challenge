import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < number.length(); i++) {
            char cur = number.charAt(i);
            
            while (!stack.isEmpty() && k > 0 && stack.peek() < cur) {
                stack.pop();
                k--;
            }
            stack.push(cur);
        }
        
        // System.out.println(stack);
        
        StringBuilder answer = new StringBuilder();
        for (char c : stack) answer.append(c);
        
        if (k > 0) return answer.substring(0, answer.length() - k);
        
        return answer.toString();
    }
}
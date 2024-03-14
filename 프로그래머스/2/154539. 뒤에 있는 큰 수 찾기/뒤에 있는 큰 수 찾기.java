import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = numbers.length - 1; i >= 0; i--) {
            while (!stack.isEmpty()) {
                if (stack.peek() <= numbers[i]) {
                    stack.pop();
                } else {
                    answer[i] = stack.peek();
                    break;
                }
            }
            if (stack.isEmpty()) answer[i] = -1;
            
            stack.push(numbers[i]);
            // System.out.println(stack);
        }
        
        return answer;
    }
}
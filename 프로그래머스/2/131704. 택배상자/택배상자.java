import java.util.*;

class Solution {
    public int solution(int[] order) {
        int cnt = 0;
        Stack<Integer> stack = new Stack<>();
        
        int idx = 0;
        for (int i = 1; i <= order.length; i++) {
            if (order[idx] != i) stack.push(i);
            else {
                idx++;
                cnt++;
            }
            // System.out.println(stack);
            while (!stack.isEmpty()) {
                if (stack.peek() == order[idx]) {
                    stack.pop();
                    cnt++;
                } else break;
                idx++;
            }
            
        }
        return cnt;
    }
}

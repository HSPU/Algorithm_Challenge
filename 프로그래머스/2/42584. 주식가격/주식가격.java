import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> q = new LinkedList<>();
        int idx = 0;
        
        for (int i : prices) q.add(i);
        
        while (!q.isEmpty()) {
            int current = q.poll();
            for (int i = (prices.length - q.size()); i < prices.length; i++) {
                if (current <= prices[i]) {
                    answer[idx]++;
                } else {
                    answer[idx]++;
                    break;
                }
            }
            idx++;
        }
        
        return answer;
    }
}
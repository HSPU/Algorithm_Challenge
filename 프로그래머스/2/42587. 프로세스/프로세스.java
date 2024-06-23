import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int cnt = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : priorities) pq.add(i);
        
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (pq.peek() == priorities[i]) {
                    pq.poll();
                    cnt++;
                    if (location == i) return cnt;
                }
            }
        }
        return cnt;
    }
}
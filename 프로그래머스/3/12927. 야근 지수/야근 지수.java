import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i : works) pq.add(i);
        
        for (int i = 0; i < n; i++) {
            int work = pq.poll();
            if (work == 0) return 0;
            pq.add(work - 1);
        }
        System.out.println(pq);
        
        while (!pq.isEmpty()) {
            int work2 = pq.poll();
            answer += work2 * work2;
        }
        return answer;
    }
}
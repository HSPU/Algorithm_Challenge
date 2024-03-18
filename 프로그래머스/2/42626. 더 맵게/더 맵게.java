import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int cnt = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        for (int i : scoville) que.add(i);
        // System.out.println(que);
        
        while (que.peek() < K) {
            if (que.size() == 1) return -1;
            que.add(que.poll() + que.poll() * 2);
            cnt++;
        }
        return cnt;
    }
}
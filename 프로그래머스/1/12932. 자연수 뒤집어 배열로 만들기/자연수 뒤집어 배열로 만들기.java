import java.util.*;

class Solution {
    public long[] solution(long n) {
        Queue<Long> q = new LinkedList<>();
        
        long idx = 0;
        while (n > 0) {
            idx = n % 10;
            n /= 10;
            q.add(idx);
            idx++;
        }
        long[] answer = new long[q.size()];
        for (int i = 0; i < answer.length; i++) answer[i] = q.poll();
        return answer;
    }
}
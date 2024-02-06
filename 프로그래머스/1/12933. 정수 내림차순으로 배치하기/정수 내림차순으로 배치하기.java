import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        long idx = 0;
        List<Long> list = new ArrayList<>();
        
        while (n > 0) {
            idx = n % 10;
            list.add(idx);
            n /= 10;
        }
        Collections.sort(list);
        
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * (long) Math.pow(10, i);
        }
        
        return answer;
    }
}
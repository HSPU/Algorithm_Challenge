import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            if (Long.valueOf(t.substring(i, p.length() + i)) <= Long.valueOf(p)) {
                answer++;
            }
        }
        
        return answer;
    }
}
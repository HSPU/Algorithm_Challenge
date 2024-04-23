import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        // System.out.println(Arrays.toString(d));
        
        for (int i = 0; i < d.length; i++) {
            if (d[i] <= budget) {
                answer++;
                budget -= d[i];
            }
            if (budget <= 0) break;
        }
        return answer;
    }
}
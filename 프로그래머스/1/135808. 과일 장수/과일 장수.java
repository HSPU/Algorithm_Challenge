import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int count = 0;
        Arrays.sort(score);
        // [1, 1, 1, 2, 2, 3, 3]
        // [3, 3, 2, 2, 1, 1, 1]
        for (int i = score.length; i >= m; i -= m) {
            answer += score[i - m] * m;
            // System.out.println(answer);
        }
        
        
        return answer;
    }
}
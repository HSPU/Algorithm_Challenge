import java.util.*;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        
        Arrays.sort(A);
        // 1, 2, 4
        Arrays.sort(B);
        // 4, 4, 5
        
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }

        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int answerIdx = 0;
        int answer[] = new int[commands.length];
        
        for (int k = 0; k < commands.length; k++) {
            int idx = 0;
            int arr[] = new int[(commands[k][1] - commands[k][0]) + 1];
            
            for (int i = commands[k][0] - 1; i < commands[k][1]; i++) {
                arr[idx++] = array[i];
            }
            
            Arrays.sort(arr);
            answer[answerIdx++] = arr[commands[k][2] - 1];
        }
        return answer;
    }
}
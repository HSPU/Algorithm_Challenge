import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] asc = new int[emergency.length];
        int[] answer = new int[emergency.length];
        
        for (int i = 0; i < emergency.length; i++) {
            asc[i] = emergency[i];
        }
        
        Arrays.sort(asc);
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (asc[i] == emergency[j]) {
                    answer[j] = emergency.length - i;
                }
            }
        }
        
        return answer;
    }
}
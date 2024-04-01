import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) cnt++;
        }
            
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    answer[0]++;
                    answer[1]++;
                }
            }
        }
        
        int best = 7 - cnt - answer[1];
        int worst = 7 - answer[1];
        
        if (best < 1) best = 1;
        else if (best > 6) best = 6;
        if (worst > 6) worst = 6;
        
        return new int[]{best, worst};
    }
}
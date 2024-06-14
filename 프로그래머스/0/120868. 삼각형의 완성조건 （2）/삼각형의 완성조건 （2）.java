import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int cnt = 0;
        
        Arrays.sort(sides);      
        for (int i = 0; i < sides[0] + sides[1]; i++) {
            if (sides[0] + i > sides[1]) cnt++;
        }
        return cnt;
    }
}
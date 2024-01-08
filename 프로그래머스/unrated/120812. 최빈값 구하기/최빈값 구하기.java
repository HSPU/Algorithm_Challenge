import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int number : array) {
            int count = map.getOrDefault(number, 0) + 1;
            
            if (count > max) {
                max = count;
                answer = number;
            } else if (count == max) {
                answer = -1;
            }
            
            map.put(number, count);
        }
        
        
        return answer;
    }
}
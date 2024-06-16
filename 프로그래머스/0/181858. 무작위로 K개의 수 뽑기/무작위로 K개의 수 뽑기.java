import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList<>();
        Arrays.fill(answer, -1);
        
        for (int i : arr) {
            if (list.indexOf(i) == -1) list.add(i);
        }
        
        int length = list.size() > k ? k : list.size();
        for (int i = 0; i < length; i++) answer[i] = list.get(i);
        return answer;
    }
}
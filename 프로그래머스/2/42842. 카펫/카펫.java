import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // List<Integer> list = new ArrayList<>();
        // for (int i = 1; i <= brown + yellow; i++) {
        //     if ((brown + yellow) % i == 0) list.add(i);
        // }
        // System.out.println(list);
        // int idx = list.size() / 2;
        // if (list.size() % 2 == 0) {
        //     answer[0] = list.get(idx);
        //     answer[1] = list.get(idx - 1);
        // } else {
        //     answer[0] = list.get(idx);
        //     answer[1] = list.get(idx);
        // }
        
        int sum = brown + yellow;
        
        for (int i = 3; i < sum; i++) {
            int j = sum / i;
            
            if (sum % i == 0 && j >= 3) {
                int col = Math.max(i, j);
                int row = Math.min(i, j);
                int center = (col - 2) * (row - 2);
                
                if (center == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                }
            }
        }
        
        return answer;
    }
}
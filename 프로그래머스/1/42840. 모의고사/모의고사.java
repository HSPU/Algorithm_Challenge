import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thr = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % 5]) score[0]++;
            if (answers[i] == two[i % 8]) score[1]++;
            if (answers[i] == thr[i % 10]) score[2]++;
        }
        
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        for (int i = 0; i < score.length; i++) {
            if (maxScore == score[i]) list.add(i + 1);
        }
        
        return list;
    }
}
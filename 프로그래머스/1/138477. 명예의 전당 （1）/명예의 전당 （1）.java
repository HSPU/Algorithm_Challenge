import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        // k의 list scoreList
        // 그리고 각 인덱스의 최솟값을 answer 에 넣는다
        int[] answer = new int[score.length];
        List<Integer> scoreList = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            scoreList.add(score[i]);
            if (scoreList.size() > k) {
                scoreList.remove(Collections.min(scoreList));
            }
            for (int j = 0; j < scoreList.size(); j++) {
                answer[i] = Collections.min(scoreList);
            }
        }
        
        System.out.println(scoreList);
        
        return answer;
    }
}
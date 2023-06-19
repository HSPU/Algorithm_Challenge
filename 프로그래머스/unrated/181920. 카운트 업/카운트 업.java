class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        for (int j = start; j <= end; j++) {
            for (int i = 0; i < answer.length; i++) {
                 answer[i] = j++;
            }
        }
        return answer;
    }
}
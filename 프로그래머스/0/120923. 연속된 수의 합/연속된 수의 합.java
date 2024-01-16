class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = total / num;
        }
        for (int i = 1; i <= answer.length / 2; i++) {
            if (num % 2 != 0) {
                answer[num / 2 + i] += i;
                answer[num / 2 - i] -= i;
            }
        }
        for (int i = 0; i < answer.length / 2; i++) {
            if (num % 2 == 0) {
                answer[num / 2 + i] += i + 1;
                answer[num / 2 - i - 1] -= i;
            }
        }
        
        return answer;
    }
}
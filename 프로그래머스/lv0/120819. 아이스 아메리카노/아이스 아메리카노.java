class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int ia = 5500;
        answer[0] = money / ia;
        answer[1] = money % ia;
        return answer;
    }
}
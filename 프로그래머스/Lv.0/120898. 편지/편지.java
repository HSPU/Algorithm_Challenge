class Solution {
    public int solution(String message) {
        int answer = 0;
        for (int i = 0; i <= message.length(); i++) answer = i * 2;
        return answer;
    }
}
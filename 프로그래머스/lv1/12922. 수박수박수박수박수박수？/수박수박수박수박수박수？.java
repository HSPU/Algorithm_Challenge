class Solution {
    public String solution(int n) {
        String answer = "";
        String su = "수";
        String bak = "박";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) answer += su;
            else answer += bak;
        }
        return answer;
    }
}
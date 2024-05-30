class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] str = my_string.split("");
        for (int i = c - 1; i < str.length; i += m) {
            answer += str[i];
        }
        return answer;
    }
}
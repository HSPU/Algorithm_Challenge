class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("Z")) {
                str[i] = String.valueOf(Integer.valueOf(str[i - 1]) * -1);
            }
            answer += Integer.valueOf(str[i]);
        }
        return answer;
    }
}
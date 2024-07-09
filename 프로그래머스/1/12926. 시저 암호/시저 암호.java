class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] str = s.split("");
        for (String i : str) {
            int asc = i.charAt(0);
            if (!i.equals(" ")) {
                asc += n;
                if (i.matches("[A-Z]")) {
                    if (asc > 90) asc -= 26;
                } else {
                    if (asc > 122) asc -= 26;
                }
            }
            answer += (char) asc;
        }
        return answer;
    }
}
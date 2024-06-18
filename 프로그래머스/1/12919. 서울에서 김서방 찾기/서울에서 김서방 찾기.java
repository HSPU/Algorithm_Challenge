class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) answer = String.valueOf(i);
        }
        return "김서방은 " + answer + "에 있다";
    }
}
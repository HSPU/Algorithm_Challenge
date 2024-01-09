class Solution {
    public String solution(int age) {
        String answer = "";
        String reverse = "";
        while (age > 0) {
            int rem = age % 10 + 97;
            answer += (char) rem;
            age /= 10;
        }
        for (int i = answer.length() - 1; i >= 0; i--) {
            reverse += answer.charAt(i);
        }
        return reverse;
    }
}
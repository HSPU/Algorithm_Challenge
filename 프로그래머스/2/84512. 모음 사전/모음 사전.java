class Solution {
    public int solution(String word) {
        int answer = 0;
        int total = 3905;
        String vowel = "AEIOU";
        
        for (String str : word.split("")) {
            total /= 5;
            answer += total * vowel.indexOf(str) + 1;
        }
        return answer;
    }
}
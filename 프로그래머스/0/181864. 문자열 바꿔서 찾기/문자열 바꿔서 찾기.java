class Solution {
    public int solution(String myString, String pat) {
        String answer = myString.replace("A", "X").replace("B", "A").replace("X", "B");
        
        if (answer.contains(pat)) return 1;
        else return 0;
    }
}
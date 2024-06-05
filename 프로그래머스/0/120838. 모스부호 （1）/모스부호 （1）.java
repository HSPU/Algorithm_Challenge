class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
            };
        String[] str = letter.split(" ");
        
        for (int i = 0; i < morse.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[j].equals(morse[i])) {
                    char c = (char) (i + 97);
                    str[j] = String.valueOf(c);
                }
            }
        }
        return String.join("", str);
    }
}
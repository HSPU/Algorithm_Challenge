class Solution {
    public int solution(int n) {
        String[] str = Integer.toString(n, 3).split("");
        String[] reverse = new String[str.length];
        
        for (int i = str.length - 1, j = 0; i >= 0; i--, j++) reverse[j] = str[i];
        return Integer.parseInt(String.join("", reverse), 3);
    }
}
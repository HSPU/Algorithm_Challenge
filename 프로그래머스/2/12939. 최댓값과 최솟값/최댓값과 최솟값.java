class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
    
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < str.length; i++) {
            int stri = Integer.valueOf(str[i]);
            if (stri > max) max = stri;
            if (stri < min) min = stri;
        }
    
        return String.valueOf(min) + " " + String.valueOf(max);
    }
}
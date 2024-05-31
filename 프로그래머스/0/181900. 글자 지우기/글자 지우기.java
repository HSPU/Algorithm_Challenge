import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] str = my_string.split("");
        
        for (int i : indices) str[i] = "";
        return String.join("", str);
    }
}
import java.util.*;

class Solution {
    boolean solution(String s) {
        int idx = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') idx++;
            else if (s.charAt(i) == ')' && idx == 0) return false;
            else idx--;
        }
        return idx == 0;
    }
}
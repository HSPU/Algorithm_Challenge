import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            answer = s.matches("^[\\d]*$");
        } else answer = false;
        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int cnt = 0;
        
        String[] str = polynomial.split(" \\+ ");
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("x")) {
                if (!str[i].replace("x", "").equals("")) {
                    str[i] = str[i].replace("x", "");
                    x += Integer.valueOf(str[i]);
                } else {
                    x++;
                }
            } else {
                cnt += Integer.valueOf(str[i]);
            }
        }
        
        String cntS = String.valueOf(cnt);
        String nx = String.valueOf(x) + "x";
        
        if (x == 1) {
            if (cnt == 0) answer = "x";
            else answer = answer = "x" + " + " + cntS;
        } else if (x == 0) {
            answer = cntS;
        } else {
            if (cnt == 0) answer = nx;
            else answer = nx + " + " + cntS;
        }
        
        return answer;
    }
}
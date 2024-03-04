import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        int[] xCnt = new int[10];
        int[] yCnt = new int[10];
        
        for (String x : X.split("")) {
            xCnt[Integer.parseInt(x)]++;
        }
        for (String y : Y.split("")) {
            yCnt[Integer.parseInt(y)]++;
        }
        
        System.out.println(Arrays.toString(xCnt));
        System.out.println(Arrays.toString(yCnt));
        
        for (int i = 9; i >= 0; i--) {
            while (xCnt[i] > 0 && yCnt[i] > 0) {
                answer.append(i);
                
                xCnt[i]--;
                yCnt[i]--;
            }
        }
        
        if ("".equals(answer.toString())) return "-1";
        if ("0".equals(answer.toString().substring(0, 1))) return "0";
        
        return answer.toString();
    }
}
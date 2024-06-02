import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String[] str1 = before.split("");
        String[] str2 = after.split("");
        Arrays.sort(str1);
        Arrays.sort(str2);
        if (Arrays.equals(str1, str2)) return 1;
        else return 0;
    }
}
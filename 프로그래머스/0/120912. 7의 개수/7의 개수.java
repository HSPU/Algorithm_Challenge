import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] str = new String[array.length];
        for (int i = 0; i < array.length; i++) str[i] = Integer.toString(array[i]);
        String[] str2 = String.join("", str).split("");
        for (int i = 0; i < str2.length; i++) {
            if (str2[i].equals("7")) answer++;
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(String my_string) {
        int sum = 0;
        String[] str = my_string.toLowerCase().split("[a-z]");
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) sum += Integer.valueOf(str[i]);
        }
        return sum;
    }
}
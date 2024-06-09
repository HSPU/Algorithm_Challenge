import java.util.*;

class Solution {
    public List solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        for (int i = n; i <= my_str.length(); i += n) {
            list.add(my_str.substring(i - n, i));
        }
        if (my_str.length() % n != 0) list.add(my_str.substring(my_str.length() - my_str.length() % n, my_str.length()));
        return list;
    }
}
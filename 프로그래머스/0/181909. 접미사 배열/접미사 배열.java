import java.util.*;

class Solution {
    public List solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i, my_string.length()));
        }
        Collections.sort(list);
        return list;
    }
}
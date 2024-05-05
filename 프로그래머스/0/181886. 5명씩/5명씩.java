import java.util.*;

class Solution {
    public List solution(String[] names) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) list.add(names[i]);
        }
        return list;
    }
}
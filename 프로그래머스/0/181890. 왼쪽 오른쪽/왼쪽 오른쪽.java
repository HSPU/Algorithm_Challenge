import java.util.*;

class Solution {
    public List solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("r")) {
                for (int j = i + 1; j < str_list.length; j++) {
                    list.add(str_list[j]);
                } break;
            } else if (str_list[i].equals("l")) {
                for (int j = 0; j < i; j++) {
                    list.add(str_list[j]);
                } break;
            }
        }
        
        return list;
    }
}
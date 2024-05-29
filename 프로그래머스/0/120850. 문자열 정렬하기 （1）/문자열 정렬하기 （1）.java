import java.util.*;

class Solution {
    public List solution(String my_string) {
        String newStr[] = my_string.replaceAll("[^0-9]", "").split("");
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < newStr.length; i++) {
            list.add(Integer.valueOf(newStr[i]));
        }
        Collections.sort(list);
        return list;
    }
}
import java.util.*;

class Solution {
    public List solution(String myStr) {
        String[] answer = myStr.split("[a-c]");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < answer.length; i++) {
            if (!answer[i].equals("")) list.add(answer[i]);
        }
        if (list.isEmpty()) list.add("EMPTY");
        return list;
    }
}
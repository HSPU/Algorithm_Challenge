import java.util.*;

class Solution {
    public List solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < answer.length; i++) {
            if (!answer[i].equals("")) list.add(answer[i]);
        }
        return list;
    }
}
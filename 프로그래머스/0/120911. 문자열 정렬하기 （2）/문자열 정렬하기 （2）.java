import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.toLowerCase().charAt(i));
        }
        Collections.sort(list);
        
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }
}
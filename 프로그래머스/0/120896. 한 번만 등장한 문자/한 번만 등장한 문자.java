import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        List<String> list = Arrays.asList(s.split(""));
        Set<String> set = new HashSet<>(list);
        
        for (int i = 0; i < list.size(); i++) {
            Collections.sort(list);
            if (Collections.frequency(list, list.get(i)) == 1) answer += list.get(i);
        }
        return answer;
    }
}
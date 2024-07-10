import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.replace("{", "");
        s = s.replace("}", "");
        String[] str = s.split(",");
        
        Map<String, Integer> map = new HashMap<>();
        for (String i : str) map.put(i, map.getOrDefault(i, 0) + 1);
        
        List<String> keySet = new ArrayList<>(map.keySet());
        
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        int[] answer = new int[keySet.size()];
        for (int i = 0; i < keySet.size(); i++) {
            answer[i] = Integer.valueOf(keySet.get(i));
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i : tangerine) map.put(i, map.getOrDefault(i, 0) + 1);
        // System.out.println(map);
        
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1 , o2) -> map.get(o2) - map.get(o1)); // 내림차순 정렬
        // System.out.println(list);
        // System.out.println(map);
        
        for (int i : list) {
            cnt++;
            k -= map.get(i);
            if (k <= 0) break;
        }
        return cnt;
    }
}
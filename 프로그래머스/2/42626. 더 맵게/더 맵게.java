import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        
        for (int i : scoville) list.add(i);
        // System.out.println(list);
        
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
        int mix = list.get(0) + list.get(1) * 2;
            while (list.get(i) < K) {
                // if (list.get(i) < K) return -1;
                Collections.sort(list);
                list.add(mix);
                list.remove(0);
                list.remove(0);
                cnt++;
            }
        }
        return cnt;
    }
}
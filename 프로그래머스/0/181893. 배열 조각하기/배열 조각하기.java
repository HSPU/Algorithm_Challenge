import java.util.*;

class Solution {
    public List solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) list.add(i);
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                for (int j = list.size() - 1; j > query[i]; j--) {
                    list.remove(j);
                }
            } else {
                for (int j = query[i] - 1; j >= 0; j--) {
                    list.remove(j);
                }
            }
        }
        return list;
    }
}
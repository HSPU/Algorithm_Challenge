import java.util.*;

class Solution {
    public List solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            if (i % n == 0) list.add(num_list[i]);
        }
        return list;
    }
}
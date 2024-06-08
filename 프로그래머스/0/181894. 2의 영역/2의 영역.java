import java.util.*;

class Solution {
    public List solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) list.add(i);
        }
        if (list.isEmpty()) list.add(-1);
        
        List<Integer> list2 = new ArrayList<>();
        for (int i = list.get(0); i <= list.get(list.size() - 1); i++) {
            if (list.get(0) != -1) list2.add(arr[i]);
            else list2.add(-1);
        }
        return list2;
    }
}
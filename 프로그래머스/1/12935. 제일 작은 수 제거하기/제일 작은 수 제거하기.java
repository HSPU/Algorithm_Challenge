import java.util.*;

class Solution {
    public List solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) list.add(i);
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        list.remove(Integer.valueOf(min));
        if (list.isEmpty()) list.add(-1);
        return list;
    }
}
import java.util.*;

class Solution {
    public List solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length;) {
            if (list.isEmpty()) {
                list.add(arr[i]);
                i++;
            } else if (list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
                i++;
            } else {            
                list.remove(list.size() - 1);
            }            
        }    
        return list;
    }
}
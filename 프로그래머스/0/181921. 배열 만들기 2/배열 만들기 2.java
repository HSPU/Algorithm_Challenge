import java.util.*;

class Solution {
    public List solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("[0, 5]+")) list.add(i);
        }
        if (list.isEmpty()) list.add(-1);
        return list;
    }
}
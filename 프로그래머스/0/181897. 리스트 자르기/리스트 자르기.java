import java.util.*;

class Solution {
    public List solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= slicer[1]; i++) {
            if (n == 1) list.add(num_list[i]);
        }
        for (int i = slicer[0]; i < num_list.length; i++) {
            if (n == 2) list.add(num_list[i]);
        }
        for (int i = slicer[0]; i <= slicer[1]; i++) {
            if (n == 3) list.add(num_list[i]);
        }
        for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
            if (n == 4) list.add(num_list[i]);
        }
        return list;
    }
}
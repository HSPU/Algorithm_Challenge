import java.util.*;

class Solution {
    public List solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while (n > 1) {
            if (n % 2 == 0) list.add(n /= 2);
            else list.add(n = 3 * n + 1);
        }
        return list;
    }
}
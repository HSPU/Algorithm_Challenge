import java.util.*;

class Solution {
    public List solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            int subStrs = Integer.valueOf(intStrs[i].substring(s, s + l));
            if (subStrs > k) list.add(subStrs);
        }
        return list;
    }
}
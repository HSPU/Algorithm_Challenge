import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < strArr.length; i++) {
            list.add(strArr[i].length());
        }
        
        int[] count = new int[strArr.length];
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == strArr[i].length()) {
                count[strArr[i].length()]++;
            }
        }
        
        Arrays.sort(count);
        return count[count.length - 1];
    }
}
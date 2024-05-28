import java.util.*;

class Solution {
    public int[] solution(String s) {
        return recursive(s, 0, 0);
    }
    
    private int[] recursive(String s, int cnt, int trans) {
        if (s.equals("1")) {
            return new int[]{trans, cnt};
        }
        
        int zeroCnt = 0;
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        
        Iterator<String> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            if (iterator.next().equals("0")) {
                iterator.remove();
                zeroCnt++;
            }
        }
        
        cnt += zeroCnt++;
        trans++;
        
        String binary = Integer.toBinaryString(list.size());
        
        return recursive(binary, cnt, trans);
    }
}
import java.util.*;

class Solution {
    public List<Integer> solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        
        // Collections.sort(list);
        // System.out.println(list);
        
        Set<Integer> set = new HashSet<>(list);
        List<Integer> list2 = new ArrayList<>(set);
        Collections.sort(list2);
        // System.out.println(list2);
        return list2;
    }
}

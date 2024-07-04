import java.util.*;

class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        boolean[] visited = new boolean[cards.length];
        List<Integer> list = new ArrayList<>();
        System.out.println(Arrays.toString(visited));
        
        for (int i = 0; i < cards.length; i++) {
            if (!visited[i]) {
                int listSize = 0;
                int idx = i;
                while (!visited[idx]) {
                    visited[idx] = true;
                    idx = cards[idx] - 1;
                    listSize++;
                }
                list.add(listSize);
            }
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        if (list.size() > 1) return list.get(0) * list.get(1);
        else return 0;
    }
}
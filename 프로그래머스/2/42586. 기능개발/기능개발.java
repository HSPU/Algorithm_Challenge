import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int cnt = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            int day = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) day += 1;
            // 나머지 있으면 +1
            q.offer(day);
        }
            
//         while (!q.isEmpty()) {
//             int current = q.poll();
//             cnt++;
//             if (!q.isEmpty()) {
//                 if (current >= q.peek()) {
//                     cnt++;
//                     answer.add(cnt);
//                 } else {
//                     cnt = 1;
//                     answer.add(cnt);
//                 }
//             } 
//         }
        
        while (!q.isEmpty()) {
            int current = q.poll();
            cnt = 1;

            while (!q.isEmpty() && current >= q.peek()) {
                cnt++;
                q.poll();
            }
            answer.add(cnt);
        }
        
        int[] arr = new int[answer.size()];
        // for (int i : answer) arr[i] = answer.get(i);
        for (int i = 0; i < answer.size(); i++) arr[i] = answer.get(i);
        
        System.out.println(answer);
        return arr;
    }
}
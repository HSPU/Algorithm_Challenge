import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        double[] fail = new double[N];
        int people = stages.length;
        int count = 0;
        int[] answer = new int[N];
        int[] sortStages = new int[people];
        for (int i = 0; i < people; i++) {
            sortStages[i] = stages[i];
        }
        // [1, 2, 2, 2, 3, 3, 4, 6]
        Arrays.sort(sortStages);
        
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (sortStages[j] == i) {
                    count++;
                }
            }
            
            fail[i - 1] = (people == 0) ? 0.0 : (double) count / people;
            people -= count;
            count = 0;
            // System.out.println(fail[i - 1]);
        }
        // map 내림차순 정렬하고 NaN 맨 뒤로 가도록 처리
        
        List<Map.Entry<Integer, Double>> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(new AbstractMap.SimpleEntry<>(i + 1, fail[i]));
        }
        list.sort(Map.Entry.<Integer, Double>comparingByValue().reversed());
        
        // 정렬된 결과의 인덱스를 반환
        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i).getKey();
        }
        
        return answer;
    }
}
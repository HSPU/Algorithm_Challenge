class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int first = 0;
        int second = 0;
        int third = 0;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int thirdMin = Integer.MAX_VALUE;
        
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] && rank[i] < min) {
                // rank[i] 가 낮을수록 등수(i)가 높음
                min = rank[i];
                first = i * 10000;
            }
        }
        
        if (second != -1) {
            for (int i = 0; i < attendance.length; i++) {
                if (attendance[i] && rank[i] < secondMin && rank[i] > min) {
                    // min 이후이면서 현재까지의 최솟값보다 작은 값을 찾음
                    secondMin = rank[i];
                    second = i * 100;  // 다음 최솟값을 가진 인덱스 업데이트
                } 
            }
        }
        if (third != -1) {
            for (int i = 0; i < attendance.length; i++) {
                if (attendance[i] && rank[i] < thirdMin && rank[i] > secondMin) {
                    thirdMin = rank[i];
                    third = i;
                } 
            }
        }
        
        answer = first + second + third;
        return answer;
    }
}
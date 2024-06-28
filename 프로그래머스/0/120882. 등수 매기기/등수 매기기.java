class Solution {
    public int[] solution(int[][] score) {
        double[] arr = new double[score.length];
        
        for (int i = 0; i < score.length; i++) {
            double avg = (score[i][0] + score[i][1]) / 2.0;
            arr[i] = avg;
        }
        
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) rank++;
            }
            answer[i] = rank;
        }
        return answer;
    }
}
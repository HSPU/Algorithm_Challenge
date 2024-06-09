class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        answer = arr;
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < queries[0].length - 1; j++) {
                for (int k = queries[i][0]; k <= queries[i][j]; k++) {
                    if (k % queries[i][2] == 0) {
                        answer[k]++;
                    }
                }
            }
            if (queries[i][0] == 0) answer[0]--;
        }
        return answer;
    }
}
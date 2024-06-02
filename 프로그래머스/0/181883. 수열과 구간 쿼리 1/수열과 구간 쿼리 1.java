class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        answer = arr;
        for (int i = 0; i < queries.length; i++) {
            for (int k = queries[i][0]; k <= queries[i][1]; k++) {
                answer[k] += 1;
            }
        }
        return answer;
    }
}
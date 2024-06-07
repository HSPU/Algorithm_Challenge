class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        answer = arr;
        for (int j = 0; j < queries.length; j++) {
            int temp = answer[queries[j][0]];
            answer[queries[j][0]] = answer[queries[j][1]];
            answer[queries[j][1]] = temp;
        }
        return answer;
    }
}
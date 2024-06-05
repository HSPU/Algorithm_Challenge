class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        for (int i = 1; i < 1025; i *= 2) {
            if (arr.length <= i) {
                cnt = i;
                break;
            }
        }
        int[] answer = new int[cnt];
        for (int i = 0; i < arr.length; i++) answer[i] = arr[i];
        return answer;
    }
}
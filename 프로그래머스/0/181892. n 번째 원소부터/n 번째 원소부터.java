class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx = 0;
        int[] answer = new int[num_list.length - n + 1];
        for (int i = n - 1; i < num_list.length; i++) answer[idx++] = num_list[i];
        return answer;
    }
}
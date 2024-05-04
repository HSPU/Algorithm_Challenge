class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length <= 10) {
                mul *= num_list[i];
                answer = mul;
            } else {
                sum += num_list[i];
                answer = sum;
            }
        }
        return answer;
    }
}
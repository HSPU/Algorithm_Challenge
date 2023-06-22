class Solution {
    public int solution(int[] numbers, int n) {
        int i = 0;
        int sum = 0;
        while (sum <= n) sum += numbers[i++];
        return sum;
    }
}
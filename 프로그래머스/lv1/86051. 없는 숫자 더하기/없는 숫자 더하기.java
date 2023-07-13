class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < 10; i++) {
                if (numbers[j] == i) sum += i;
            }
        }
        return 45 - sum;
    }
}
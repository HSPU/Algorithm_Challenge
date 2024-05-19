class Solution {
    public int solution(int[] numbers) {
        int multiple = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                multiple = numbers[i] * numbers[j];
                if (multiple > max) max = multiple;
            }
        }
        return max;
    }
}
class Solution {
    public double solution(int[] numbers) {
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) sum += numbers[i];    
        float average = sum / numbers.length;
        return average;
    }
}
class Solution {
    public int[] solution(int n) {
        int divisor = 2;
        int[] arr = new int[n + 1];

        while (n > 1) {
            if (n % divisor == 0) {
                arr[divisor] = divisor;
                n /= divisor;
            } else {
                divisor++;
            }
        }
        
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) size++;
        }
        
        int[] answer = new int[size];
        int answerIdx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer[answerIdx++] = arr[i];
            }
        }
        return answer;
    }
}
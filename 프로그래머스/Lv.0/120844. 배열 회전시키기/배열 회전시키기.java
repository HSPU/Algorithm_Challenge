class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int idx = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (direction.equals("right")) {
                answer[0] = numbers[i];
                answer[i] = numbers[idx++];                
            } else {
                answer[i] = numbers[0];
                answer[idx++] = numbers[i];
            }
        }
        return answer;
    }
}
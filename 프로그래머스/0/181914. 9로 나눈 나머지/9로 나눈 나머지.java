class Solution {
    public int solution(String number) {
        int sum = 0;
        String[] arr = number.split("");
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.valueOf(arr[i]);
        }
        return sum % 9;
    }
}
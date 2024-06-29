class Solution {
    public int solution(int n) {
        int[] arr = new int[301];
        int idx = 0;
        for (int i = 1; i <= 300; i++) {
            if (i % 3 != 0 && !String.valueOf(i).contains("3")) {
                arr[idx++] = i;
            }
        }
        return arr[n - 1];
    }
}
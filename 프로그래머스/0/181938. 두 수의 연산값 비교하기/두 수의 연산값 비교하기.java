class Solution {
    public int solution(int a, int b) {
        String sum = String.valueOf(a) + String.valueOf(b);
        if (Integer.valueOf(sum) > (2 * a * b)) return Integer.valueOf(sum);
        else return 2 * a * b;
    }
}
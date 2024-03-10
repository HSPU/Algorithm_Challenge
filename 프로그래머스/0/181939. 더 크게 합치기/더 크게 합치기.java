class Solution {
    public int solution(int a, int b) {
        String alpha = String.valueOf(a);
        String beta = String.valueOf(b);
        int ab = Integer.valueOf(alpha + beta);
        int ba = Integer.valueOf(beta + alpha);
        if (ab > ba) return ab;
        else return ba;
    }
}
class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        if (Math.pow((long) sqrt, 2) == n) answer = (long) Math.pow(sqrt + 1, 2);
        else answer = -1;
        return answer;
    }
}
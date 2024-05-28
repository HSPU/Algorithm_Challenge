class Solution {
    public long solution(long k, long d) {
        long answer = 0;
        for (long x = 0; x <= d; x += k) {
            long y = (long) Math.sqrt(d * d - x * x);
            // System.out.println(y);
            answer += y / k + 1;
            // System.out.println(answer);
        }
        return answer;
    }
}
class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        for (int i = a; i <= b; i++) sum += i;
        for (int i = b; i <= a; i++) sum += i;
        if (a == b) return a;
        return sum;
    }
}
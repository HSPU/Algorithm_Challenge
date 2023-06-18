class Solution {
    public int solution(int n) {
        return n / 1000000 + n % 1000000 / 100000 + n % 100000 / 10000 + n % 10000 / 1000 + n % 1000 / 100 + n % 100 / 10 + n % 10 / 1;
    }
}
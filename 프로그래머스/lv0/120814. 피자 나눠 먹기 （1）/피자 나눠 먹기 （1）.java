class Solution {
    public int solution(int n) {
        int result = 0;
        if (n < 8) result = 1;
        else result = (n + 6) / 7;
        return result;
    }
}
class Solution {
    public int solution(int M, int N) {
        // if (M < N) return M - 1 + M * (N - 1);
        // else return N - 1 + N * (M - 1);
        return M * N - 1;
    }
}
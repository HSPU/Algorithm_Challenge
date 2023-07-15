class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = 0;
        int numer = 0;
        int denomMax = Math.max(denom1, denom2);
        int denomMin = Math.min(denom1, denom2);
        if (denom1 % denom2 != 0 && denom2 % denom1 != 0) {
            denom = denom1 * denom2;
            numer = numer1 * denom2 + numer2 * denom1;
        } else {
            denom = denomMax;
            numer = (denom1 < denom2) ? denomMax / denomMin * numer1 + numer2 : denomMax / denomMin * numer2 + numer1;
        }
        int min = (numer < denom) ? numer : denom;
        int gcd = 0;
        for (int i = 1; i <= min; i++) {
            if (numer % i == 0 && denom % i == 0) gcd = i;
        }
        numer /= gcd;
        denom /= gcd;
        int[] answer = {numer, denom};
        return answer;
    }
}
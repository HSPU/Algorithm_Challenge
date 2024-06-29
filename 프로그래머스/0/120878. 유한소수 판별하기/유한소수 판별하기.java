class Solution {
    public int solution(int a, int b) {
        int gcd = getGcd(a, b);
        
        if (b % gcd == 0) b /= gcd;
        
        while (b % 2 == 0) {
            b /= 2;
        }
        
        while (b % 5 == 0) {
            b /= 5;
        }
        
        if (b == 1) return 1;
        else return 2;
    }
    
    private int getGcd(int a, int b) {
        if (b == 0) return a;
        else return getGcd(b, a % b);
    }
}
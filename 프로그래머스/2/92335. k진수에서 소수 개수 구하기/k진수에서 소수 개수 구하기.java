import java.util.*;

class Solution {
    public int solution(int n, int k) {
        String trans = Long.toString(n, k);
        String[] str = trans.split("[0]+");
        
        int cnt = 0;
        for (String s : str) {
            if (isPrime(Long.valueOf(s))) cnt++;
        }
        return cnt;
    }
    
    private boolean isPrime(long num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
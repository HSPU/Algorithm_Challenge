class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = getLcm(lcm, arr[i]);
        }
        return lcm;
    }
    
    private int getGcd(int a, int b) {
        if (b == 0) return a;
        else return getGcd(b, a % b);
    }
    
    private int getLcm(int a, int b) {
        return (a * b) / getGcd(a, b);
    }
}
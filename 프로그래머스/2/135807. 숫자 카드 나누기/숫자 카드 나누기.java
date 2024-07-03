class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];
        for (int i = 1; i < arrayA.length; i++) {
            gcdA = getGcd(gcdA, arrayA[i]);
            gcdB = getGcd(gcdB, arrayB[i]);
            // System.out.println("A = " + gcdA);
            // System.out.println("B = " + gcdB);
        }
        
        for (int i : arrayA) {
            if (i % gcdB == 0) {
                gcdB = 0;
                break;
            }
        }
        
        for (int i : arrayB) {
            if (i % gcdA == 0) {
                gcdA = 0;
                break;
            }
        }
        
        return Math.max(gcdA, gcdB);
    }
    
    private int getGcd(int a, int b) {
        if (b == 0) return a;
        else return getGcd(b, a % b);
    }
}
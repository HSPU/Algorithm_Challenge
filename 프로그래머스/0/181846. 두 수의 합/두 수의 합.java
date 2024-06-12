import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger a2 = new BigInteger(a);
        BigInteger b2 = new BigInteger(b);
        return (a2.add(b2)).toString();
    }
}
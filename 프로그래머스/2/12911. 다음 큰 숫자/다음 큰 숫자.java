class Solution {
    public int solution(int n) {
        int answer = 0;
        String binary = Integer.toBinaryString(n);
        
        for (int i = 0; i < n; i++) {
            String binary2 = Integer.toBinaryString(n += 1);
            if (binary.replace("0", "").equals(binary2.replace("0", ""))) {
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}
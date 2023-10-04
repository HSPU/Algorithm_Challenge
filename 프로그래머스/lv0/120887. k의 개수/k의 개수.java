class Solution {
    public int solution(int i, int j, int k) {
        int cnt = 0;
        for (int n = i; n <= j; n++) {
            String strNum = Integer.toString(n);
            for (int m = 0; m < strNum.length(); m++) {
                if(Integer.toString(k).equals(strNum.substring(m, m + 1))) cnt++;
            }
        }
        return cnt;
    }
}
class Solution {
    public int solution(int order) {
        int cnt = 0;
        String[] str = String.valueOf(order).split("");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("3") || str[i].equals("6") || str[i].equals("9")) cnt++;
        }
        return cnt;
    }
}
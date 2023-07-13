class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String s = Integer.toString(x);
        
        for (int i = 0; i < s.length(); i++) sum += Integer.parseInt(s.substring(i, i + 1));
        if (x % sum == 0) return true;
        else return false;
    }
}
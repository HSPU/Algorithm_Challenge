class Solution {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        String lowerCase = s.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            if (lowerCase.charAt(i) == 'p') pCnt++; 
            if (lowerCase.charAt(i) == 'y') yCnt++; 
        }
        if (pCnt == yCnt) return true;
        else return false;
    }
}
class Solution {
    public String solution(String code) {
        String ret = "";
        boolean mode = true;
        
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) != '1') {
                if (mode) {
                    if (i % 2 == 0) ret += code.charAt(i);
                } else {
                    if (i % 2 != 0) ret += code.charAt(i);
                }
            } else {
                mode = !mode;
            }
        }
        if (ret.equals("")) return "EMPTY";
        return ret;
    }
}
class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (!babbling[i].contains("ayaaya") && !babbling[i].contains("yeye") && !babbling[i].contains("woowoo") && !babbling[i].contains("mama"))
                babbling[i] = babbling[i].replace(str[j], " ");
            }
            babbling[i] = babbling[i].replace(" ", "");
            if (babbling[i] == "") cnt++;
        }
        return cnt;
    }
}
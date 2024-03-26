class Solution {
    public int solution(String dartResult) {
        // S : 1제곱
        // D : 2제곱
        // T : 3제곱
        // * : 현재, 전 점수 * 2
        // # : 현재 점수 * -1
        int answer = 0;
        int[] score = new int[3];
        String temp = "";
        int idx = 0;
        
        for (int i = 0; i < dartResult.length(); i++) {
            char dart = dartResult.charAt(i);
            switch(dart) {
                case 'S' :
                    score[idx] = (int) Math.pow(Integer.parseInt(temp), 1);
                    idx++;
                    temp = "";
                    break;
                case 'D' :
                    score[idx] = (int) Math.pow(Integer.parseInt(temp), 2);
                    idx++;
                    temp = "";
                    break;
                case 'T' :
                    score[idx] = (int) Math.pow(Integer.parseInt(temp), 3);
                    idx++;
                    temp = "";
                    break;
                case '*' :
                    score[idx - 1] *= 2;
                    if (idx > 1) score[idx - 2] *= 2;
                    break;
                case '#' :
                    score[idx - 1] *= -1;
                    break;
                default : 
                    temp += String.valueOf(dart);
                    break;
            }
        }
        for (int i : score) answer += i;
        
        return answer;
    }
}
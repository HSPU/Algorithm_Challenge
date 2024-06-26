class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int weight = board[0] / 2;
        int height = board[1] / 2;
        
        for (String s : keyinput) {
            if (s.equals("up") && answer[1] < height) answer[1]++;
            else if (s.equals("down") && answer[1] > -height) answer[1]--;
            else if (s.equals("left") && answer[0] > -weight) answer[0]--;
            else if (s.equals("right") && answer[0] < weight) answer[0]++;
        }
        
        return answer;
    }
}
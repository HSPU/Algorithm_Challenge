class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int minX = dots[0][0];
        int minY = dots[0][1];
        int maxX = dots[0][0];
        int maxY = dots[0][1];
        
        for (int i = 0; i < dots.length; i++) {
            minX = Math.min(dots[i][0], minX);
            minY = Math.min(dots[i][1], minY);
            maxX = Math.max(dots[i][0], maxX);
            maxY = Math.max(dots[i][1], maxY);
        }
        
        answer = (maxX - minX) * (maxY - minY);
        
        return answer;
    }
}
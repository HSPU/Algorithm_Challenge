class Solution {
    public int solution(int[][] sizes) {
        // 제일 긴 길이를 가로로, 짧은 길이를 세로로
        // 가로 최대값 * 세로 최대값
        int maxW = 0;
        int maxH = 0;
        for (int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            maxW = Math.max(maxW, w);
            maxH = Math.max(maxH, h);
        }
        // System.out.println(maxW);
        // System.out.println(maxH);
        return maxW * maxH;
    }
}
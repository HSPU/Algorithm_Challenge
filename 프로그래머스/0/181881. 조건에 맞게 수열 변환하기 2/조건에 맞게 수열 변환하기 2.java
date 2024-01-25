class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int loopCnt = 0;
        
        while (answer == 0) {
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) {
                    arr[i] /= 2;
                    cnt++;
                }
                else if (arr[i] % 2 != 0 && arr[i] < 50) {
                    arr[i] = arr[i] * 2 + 1;
                    cnt++;
                }
            }
            loopCnt++;
            if (cnt == 0) answer = loopCnt;
        }
        return answer - 1;
    }
}
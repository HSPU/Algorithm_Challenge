class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int com = commands.length;
        int answerIdx = 0;
        int answer[] = new int[com];
        
        for (int k = 0; k < com; k++) {
            int idx = 0;
            int arr[] = new int[(commands[k][1] - commands[k][0]) + 1];
            
            for (int i = commands[k][0] - 1; i < commands[k][1]; i++) arr[idx++] = array[i];
            
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) { 
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                 }
             }
             answer[answerIdx++] = arr[commands[k][2] - 1];
        }
        return answer;
    }
}
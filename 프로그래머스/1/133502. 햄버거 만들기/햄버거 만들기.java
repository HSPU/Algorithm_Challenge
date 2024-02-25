class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int count = 0;
        int idx = 0;
        int[] arr = new int[ingredient.length];
        
        for (int i : ingredient) {
            arr[idx] = i;
            idx++;
            
            if (idx >= 4) {
                if (arr[idx - 4] == 1 && arr[idx-3] == 2 && arr[idx-2] == 3 && arr[idx - 1] == 1) {
                    idx -= 4;
                    count++;
                }
            }
        }
        return count;
    }
}
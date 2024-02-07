class Solution {
    public int solution(int[] nums) {
        int cnt = 0;

        setPrime();
        for(int i = 0; i < nums.length - 2; i++) 
            for(int j = i + 1; j < nums.length - 1; j++) 
                for(int k = j + 1; k < nums.length; k++) 
                    if (!check[nums[i] + nums[j] + nums[k]]) cnt++;
        
        return cnt;
    }
    
    boolean[] check = new boolean[3001];
    
    void setPrime() {
        for (int i = 2; i <= 3000; i++) {
            for (int j = i * 2; j <= 3000; j += i) check[j] = true;
        }
    }
}
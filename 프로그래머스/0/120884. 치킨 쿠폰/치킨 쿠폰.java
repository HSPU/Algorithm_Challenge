class Solution {
    public int solution(int chicken) {
        int service = 0;
        int coupon = chicken;
        while (coupon >= 10) {
            int newService = coupon / 10;
            service += newService;
            coupon = coupon % 10 + newService;
        }
        
        return service;
    }
}
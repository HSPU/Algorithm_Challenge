class Solution {
    public int solution(int price) {
        int answer = 0;
        if (price >= 100000 && price < 300000) answer = (int) (price * 0.95);
        else if (price >= 300000 && price < 500000) answer = (int) (price * 0.9);
        else if (price >= 500000) answer = (int) (price * 0.8);
        else answer = price; // 당신은 할인을 받을 수 없습니다. 10만원 미만
        return answer;
    }
}
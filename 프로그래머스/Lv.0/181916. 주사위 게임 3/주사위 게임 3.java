class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int min = 7;
        int[] arr = {a, b, c, d};
        for (int i : arr) {
            // 1번
            if (a == b && b == c && c == d) answer = 1111 * a;
            // 2번
            else if (a == b && b == c) answer = (10 * a + d) * (10 * a + d); 
            else if (a == b && b == d) answer = (10 * a + c) * (10 * a + c);
            else if (a == c && c == d) answer = (10 * a + b) * (10 * a + b);
            else if (b == c && c == d) answer = (10 * b + a) * (10 * b + a);
            // 3번
            else if (a == b && c == d) answer = (a + c) * Math.abs(a - c);
            else if (a == c && b == d) answer = (a + b) * Math.abs(a - b);
            else if (b == c && a == d) answer = (b + a) * Math.abs(b - a);
            // 4번
            else if (a == c && b != d) answer = b * d;
            else if (a == b && c != d) answer = c * d;
            else if (a == d && b != c) answer = c * b;
            else if (b == c && a != d) answer = a * d;
            else if (b == d && a != c) answer = a * c;
            else if (c == d && a != b) answer = a * b;
            // 5번
            else if (a != b && b != c && c != d) {
                min = Math.min(i, min);
                answer = min;
            } 
        }
        
        return answer;
    }
}
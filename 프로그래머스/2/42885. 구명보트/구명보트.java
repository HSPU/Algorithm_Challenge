import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int start = 0;
        int end = people.length - 1;
        int count = 0;
        // 첫사람과 끝사람을 더해서 limit 보다 크면 end를 내림
        // limit 보다 같거나 작으면 count 올리고, end 내리고 start 올리기
        Arrays.sort(people);
        int sum = people[start] + people[end];
        
        while (start < end) {
            if (sum <= limit) {
                count++;
                end--;
                start++;
                sum = people[start] + people[end];
            } else if (sum > limit) {
                end--;
                sum = people[start] + people[end];
            }
        }
        // length - count = 탄 사람 수
        return people.length - count;
    }
}
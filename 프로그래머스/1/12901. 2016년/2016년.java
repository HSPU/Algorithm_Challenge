import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        
        LocalDate date = LocalDate.of(2016, a, b);
        int today = date.getDayOfWeek().ordinal();
        return day[today];
    }
}
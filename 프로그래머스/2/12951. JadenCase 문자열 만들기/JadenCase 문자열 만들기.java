import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        
        for (int i = 0; i < arr.length; i++) {
            // (단어가 들어간) 배열 요소가 공백일 경우 answer에 공백 붙이기?
            if (arr[i].length() == 0) answer += " ";
            else {
                answer += arr[i].substring(0, 1).toUpperCase();
                answer += arr[i].substring(1, arr[i].length()).toLowerCase();
                answer += " ";
            }
        }
        if (s.substring(s.length() - 1, s.length()).equals(" ")) return answer;
        
        return answer.substring(0, answer.length() - 1);
    }
}
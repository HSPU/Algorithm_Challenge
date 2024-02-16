import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        List<String> list = new ArrayList<String>();
        
        // 이전에 등장한 단어일 때
        for (int i = 0; i < words.length; i++) {
            if (list.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            
            list.add(words[i]);
            
            // 이전 끝단어와 현재 첫단어가 다를 때
            if (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
        }
        System.out.println(list);
        return answer;
    }
}
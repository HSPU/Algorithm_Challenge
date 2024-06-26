class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for (int i = 0; i < queries.length; i++) {
            StringBuilder sub = new StringBuilder(answer.substring(queries[i][0], queries[i][1] + 1));
            sub.reverse();
            
            answer.replace(queries[i][0], queries[i][1] + 1, sub.toString());
        }
        return answer.toString();
    }
}
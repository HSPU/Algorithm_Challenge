import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        
        // idx 서로 비교해서 같으면 pop
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            st.push(arr[i]);
            if (arr[i] == arr[i - 1]) st.pop();
        }
        
        int[] answer = new int[st.size()];
        for (int i = answer.length - 1; i >= 0; i--) answer[i] = st.pop();
        
        return answer;
    }
}
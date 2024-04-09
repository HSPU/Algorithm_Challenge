import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        // map 에 형과 동생의 원소를 넣고
        // 형은 원소를 더해주고 동생은 빼줌
        // map 크기를 비교해서 크기가 같으면 answer++
        HashMap<Integer, Integer> mapY = new HashMap<>();
        HashMap<Integer, Integer> mapO = new HashMap<>();
        
        for (int i : topping) {
            mapY.put(i, mapY.getOrDefault(i, 0) + 1);
        }
        
        for (int i : topping) {
            mapO.put(i, mapO.getOrDefault(i, 0) + 1);
            
            if (mapY.get(i) - 1 == 0) {
                mapY.remove(i);
            } else {
                mapY.put(i, mapY.get(i) - 1);
            }
            
            if (mapY.size() == mapO.size()) answer++;
        }
        
        // System.out.println(mapY);
        // System.out.println(mapY.size());
        // System.out.println(mapO);
        
        return answer;
    }
}
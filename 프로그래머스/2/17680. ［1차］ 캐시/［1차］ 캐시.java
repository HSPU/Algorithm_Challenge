import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> cache = new ArrayList<>();
        
        // 캐시 크기가 0이면 cities.length * 5
        if (cacheSize == 0) return cities.length * 5;
        
        // 도시가 있으면 해당 도시 지우고 맨 뒤에 추가 (hit)
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            
            if (cache.contains(city)) {
                cache.remove(city);
                cache.add(city);
                answer++;
            }
        
        // 도시가 없다면 (miss) 1. 캐시가 다 차있을때 맨 앞 도시 삭제
            else {
                if (cache.size() == cacheSize) cache.remove(0);
            
        // 2. 캐시가 다 안찼다면 도시를 맨 뒤에 추가
                cache.add(city);
                answer += 5;
            }
        }
        return answer;
        
    }
}
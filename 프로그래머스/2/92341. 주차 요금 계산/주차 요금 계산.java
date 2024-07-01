import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int baseTime = fees[0];
        int baseFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        
        Map<String, Integer> input = new HashMap<>();
        Map<String, Integer> output = new HashMap<>();
        
        for (int i = 0; i < records.length; i++) {
            String[] temp = records[i].split(" ");
            int m = time(temp[0]);
            if (temp[2].equals("IN")) {
                input.put(temp[1], m);
            } else {
                int diff = m - input.get(temp[1]);
                input.remove(temp[1]);
                output.put(temp[1], output.getOrDefault(temp[1], 0) + diff);
            }
        }
        
        int end = time("23:59");
        for (String time : input.keySet()) {
            int diff = end - input.get(time);
            output.put(time, output.getOrDefault(time, 0) + diff);
        }
        
        List<String> numbers = new ArrayList<>();
        for (String num : output.keySet()) numbers.add(num);
        Collections.sort(numbers);
        
        int[] answer = new int[numbers.size()];
        
        for (int i = 0; i < numbers.size(); i++) {
            int cur = output.get(numbers.get(i));
            int fee = 0;
            if (cur > baseTime) {
                cur = cur - baseTime;
                double t = Math.ceil((double) cur / unitTime);
                fee = (int) t * unitFee;
            }
            answer[i] = baseFee + fee;
        }
        return answer;
    }
    
    private int time(String timestamp) {
        int hours = Integer.parseInt(timestamp.split(":")[0]) * 60;
        int minute = Integer.parseInt(timestamp.split(":")[1]);
        return hours + minute;
    }
}
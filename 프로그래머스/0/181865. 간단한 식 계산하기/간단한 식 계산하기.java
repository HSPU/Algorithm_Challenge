class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        
        int first = Integer.valueOf(arr[0]);
        int second = Integer.valueOf(arr[2]);
        if (arr[1].equals("+")) return first + second;
        else if (arr[1].equals("-")) return first - second;
        else return first * second;
    }
}
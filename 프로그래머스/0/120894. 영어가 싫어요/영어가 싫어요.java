class Solution {
    public long solution(String numbers) {
        if (numbers.contains("zero")) numbers = numbers.replace("zero", "0");
        if (numbers.contains("one")) numbers = numbers.replace("one", "1");
        if (numbers.contains("two")) numbers = numbers.replace("two", "2");
        if (numbers.contains("three")) numbers = numbers.replace("three", "3");
        if (numbers.contains("four")) numbers = numbers.replace("four", "4");
        if (numbers.contains("five")) numbers = numbers.replace("five", "5");
        if (numbers.contains("six")) numbers = numbers.replace("six", "6");
        if (numbers.contains("seven")) numbers = numbers.replace("seven", "7");
        if (numbers.contains("eight")) numbers = numbers.replace("eight", "8");
        if (numbers.contains("nine")) numbers = numbers.replace("nine", "9");
        
        return Long.valueOf(numbers);
    }
}
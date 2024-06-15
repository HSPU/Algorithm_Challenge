import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] str = a.split("");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(str[i].toLowerCase())) str[i] = str[i].toUpperCase();
            else str[i] = str[i].toLowerCase();
        }
        
        System.out.println(String.join("", str));
    }
}
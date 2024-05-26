import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int idx = 0;
        for (int i = 1; i <= a.length(); i++) {
            System.out.println(a.substring(idx++, i));
        }
    }
}
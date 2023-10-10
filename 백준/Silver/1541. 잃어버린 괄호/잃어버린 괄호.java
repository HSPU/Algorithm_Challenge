import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        String[] minus = sc.nextLine().split("-");
        for (int i = 0; i < minus.length; i++) {
            int sum = 0;
            String[] plus = minus[i].split("[+]");
            for (int j = 0; j < plus.length; j++) {
                sum += Integer.parseInt(plus[j]);
            }

            if (i == 0) answer = sum;
            else answer -= sum;
        }

        System.out.println(answer);
    }
}
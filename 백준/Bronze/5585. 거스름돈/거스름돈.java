import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] coin = {500, 100, 50, 10, 5, 1};

        int money = sc.nextInt();
        int changes = 1000 - money;
        int cnt = 0;
        for (int i = 0; i < coin.length; i++) {
            if (coin[i] <= changes) {
                cnt += changes / coin[i];
                changes %= coin[i];
            }
        }
        System.out.println(cnt);
    }
}
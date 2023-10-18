import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 정렬할 수의 개수
        int[] A = new int[N];   // 정렬할 배열
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int M = sc.nextInt();   // 탐색할 숫자의 개수
        for (int i = 0; i < M; i++) {
            boolean find = false;
            int target = sc.nextInt();  // 찾아야 하는 수
            // 이진 탐색 시작
            int start = 0;              // 시작 인덱스
            int end = A.length - 1;     // 종료 인덱스
            while (start <= end) {
                int midIndex = (start + end) / 2;   // 중간 인덱스
                int midValue = A[midIndex];
                if (midValue > target) {    // 중앙값
                    end = midIndex - 1;
                } else if (midValue < target) {
                    start = midIndex + 1;
                } else {
                    find = true;    // 찾으면 while 문 종료
                    break;
                }
            }
            if (find) System.out.println(1);
            else System.out.println(0);
        }
    }
}
package myProject;
import java.util.Scanner;
 
public class Pack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 N을 입력하세요: ");
        int N = sc.nextInt();
        sc.close();

        long result = calculateFactorial(N);
        System.out.println(N + "! = " + result);
    }

    // 팩토리얼 계산 메소드
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}

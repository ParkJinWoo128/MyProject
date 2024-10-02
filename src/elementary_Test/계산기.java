package elementary_Test;
import java.util.Scanner;

public class 계산기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫번째 숫자 입력
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = sc.nextDouble();

        // 연산자 입력
        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        char yeonSanJa = sc.next().charAt(0);

        // 두번째 숫자 입력
        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = sc.nextDouble();

        // 결과 저장
        double result;

        switch (yeonSanJa) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("오류발생~ 0으로 나눌 수 없습니다.");
                    return;
                }
                break;
            default:
                System.out.println("오류발생~ 잘못된 연산자입니다.");
                return;
        }

        // 결과 출력
        System.out.println("결과: " + result);
    }
}

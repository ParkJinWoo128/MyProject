package myProject;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        // 1 ~ 100 사이의 숫자를 랜덤으로 선택
        int targetNumber = rd.nextInt(100) + 1;
        int guess;
        int attempts = 0;  // 시도 횟수
        
        System.out.println("숫자 맞추기 게임을 시작합니다.");
        System.out.println("1부터 100 사이의 숫자를 맞추면 승리입니다. 아니면 평생 게임해야합니다.");

        // 사용자가 맞출때까지 반복
        do {
            System.out.print("숫자를 입력하세요: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > targetNumber) {
                System.out.println("다운");
            } else if (guess < targetNumber) {
                System.out.println("업");
            } else {
                System.out.println("정답입니다! " + attempts + "번만에 맞추셨습니다.");
            }
        } while (guess != targetNumber);

        sc.close();
    }
}

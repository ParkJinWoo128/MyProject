package myProject;
import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner 객체 선언
        int score = 0;  // 점수 저장 변수다
        
        // 퀴즈 문제와 답변을 배열로 저장한다
        String[] questions = {
            "1. 대한민국의 수도는?", 
            "2. 5 + 7은?", 
            "3. 바다의 색깔은?", 
            "4. 자바(Java)의 창시자는?"
        };
        
        String[][] options = {
            {"1. 서울", "2. 부산", "3. 인천", "4. 대전"},
            {"1. 10", "2. 11", "3. 12", "4. 13"},
            {"1. 빨간색", "2. 파란색", "3. 노란색", "4. 초록색"},
            {"1. 빌 게이츠", "2. 스티브 잡스", "3. 제임스 고슬링", "4. 마크 저커버그"}
        };
        
        int[] correctAnswers = {1, 3, 2, 3};  // 정답 저장 (배열 인덱스는 0부터 시작)

        // 퀴즈 출력 및 답변 입력한다
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }
            
            System.out.print("정답 번호를 입력하세요: ");
            int userAnswer = sc.nextInt();
            
            // 정답 체크한다
            if (userAnswer == correctAnswers[i]) {
                System.out.println("정답입니다!\n");
                score += 10;  // 정답일 때 10점 추가
            } else {
                System.out.println("오답입니다. 정답은 " + correctAnswers[i] + "번입니다.\n");
            }
        }
        
        // 최종 점수 출력
        System.out.println("퀴즈 종료! 당신의 최종 점수는 " + score + "점입니다.");
    }
}
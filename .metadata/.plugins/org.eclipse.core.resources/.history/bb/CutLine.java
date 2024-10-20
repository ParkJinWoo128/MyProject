package myProject;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CutLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        int hack = sc.nextInt(); // 학생 수
        int sang = sc.nextInt(); // 상 받는 사람 수
        Integer[] scores = new Integer[hack];

        // 학생들 점수 입력
        for (int i = 0; i < hack; i++) {
            scores[i] = sc.nextInt();
        }

        // 점수 내림차순으로 정렬
        Arrays.sort(scores, Collections.reverseOrder());

        // 커트라인 출력
        System.out.println("커트라인은: " +scores[sang - 1]);

        sc.close();
    }
}

package myProject;
import java.util.Scanner;
import java.util.Arrays;
public class 중앙값And평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;

        // 다섯개 입력
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
            sum += num[i];
        }
    
        // 평균 구하기
        int avg = sum / 5;
        
        // 배열 정렬
        Arrays.sort(num);
        
        // 중앙값 구하기
        int median = num[2];
        
        // 결과 출력
        System.out.println(avg);
        System.out.println(median);
    }
}
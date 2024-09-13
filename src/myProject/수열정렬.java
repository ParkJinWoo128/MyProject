package myProject;
import java.util.*;

public class 수열정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 A의 크기 N 입력받기
        int N = sc.nextInt();
        int[] A = new int[N];
        
        // 배열 A의 원소 입력받기
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        // 인덱스를 저장할 배열 P 생성
        Integer[] P = new Integer[N];
        for (int i = 0; i < N; i++) {
            P[i] = i;
        }
        
        // P 배열을 배열 A의 값에 따라 정렬
        Arrays.sort(P, Comparator.comparingInt(i -> A[i]));
        
        // 정렬된 P 배열 출력
        for (int i = 0; i < N; i++) {
            System.out.print(P[i] + " ");
        }
        
        sc.close();
    }
    
}


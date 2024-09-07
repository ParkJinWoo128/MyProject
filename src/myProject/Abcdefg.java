package myProject;
import java.util.Scanner;

public class Abcdefg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            // 출력
            System.out.println(low(A, B));
        }
        
        sc.close();
    }
    // 최대공약수를 구하는 함수
    public static int high(int a, int b) {
    	while (b != 0) {
    		int temp = b;
    		b = a % b;
    		a = temp;
    	}
    	return a;
    }
    
    // 최소공배수를 구하는 함수
    public static int low(int a, int b) {
    	return a * (b / high(a, b));
    }
}

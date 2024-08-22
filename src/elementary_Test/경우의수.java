package elementary_Test;
import java.util.Scanner;

public class 경우의수 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 상의와 하의의 색상을 조합하는 경우의 수를 계산. 색상은 둘이 다름
		long combi = (long) n * (n - 1);
		System.out.println("상의와 하의의 서로 다른 색상 조합 수: " + combi);
		
	}
}

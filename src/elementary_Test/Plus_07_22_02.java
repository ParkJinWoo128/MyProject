package elementary_Test;
import java.util.Scanner;
// 반드시 a에는 0보다 큰 수, b에는 10보다 작은 수가 입력받아야 하는 덧셈 프로그램.
public class Plus_07_22_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			if (a<=0 || b>=10) {
				System.out.println("다시 입력하십시오 > ");
			} else {
				System.out.println(a+b);
				break;
			}
		}

	}
}


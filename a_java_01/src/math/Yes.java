package math;
import java.util.Random;

public class Yes {
	public static void main(String[] args) {
		Random rd = new Random();
		
		System.out.println("Win? (Gen.G vs T1)");
		
		if (rd.nextDouble() < 0.5) {
            System.out.println("Gen.G Win");
   
        } else {
            System.out.println("T1 Win");
            System.out.println("제오구케가 승리하다");
        }
	}
}

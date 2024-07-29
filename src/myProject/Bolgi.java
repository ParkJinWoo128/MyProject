package myProject;

import java.util.Scanner;

public class Bolgi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int 불기연도;
		int 서기연도;
		boolean 진행 = true;
		
		System.out.print("연도 입력: ");
		while(진행) {
			불기연도 = sc.nextInt();
			if (1000 >= 불기연도 || 불기연도 >= 3000) {
				System.out.println("다시 입력하시오.");
				불기연도 = sc.nextInt();
			} else {
				서기연도 = 불기연도-543;
				System.out.printf("불기연도를 서기연도로 전환하면: %d 입니다.", 서기연도);
				진행 = false;
			}
		}
	}
}



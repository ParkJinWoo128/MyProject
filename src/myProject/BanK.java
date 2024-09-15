package myProject;
import java.util.Scanner;

class Bank {
    private String aNumber; // accountNumber
    private double balance;

    public Bank(String aNumber, double Balance) {
        this.aNumber = aNumber;
        this.balance = Balance;
    }

    public String getANumber() {
        return aNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("성공적 입금이다 ㅇ: " + amount);
        } else {
            System.out.println("입금 금액은 양수여야 합니다. :( ");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("성공적 출금이다 ㅇ: " + amount);
        } else {
            System.out.println("잔액이 부족합니다. :( ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank account = new Bank("123456789", 1000.0);

        while (true) {
            System.out.println("\n 메뉴를 선택하세요:");
            System.out.println("1. 잔액 확인");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 종료");

            System.out.print("선택: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("현재 잔액: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("입금할 금액을 입력하세요: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("출금할 금액을 입력하세요: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 선택임니다. 다시 시도하세요.");
            }
        }
    }
}

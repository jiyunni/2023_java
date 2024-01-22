
import java.util.Scanner;

public class practice57 {
    public static void main(String[] args) {
        BankAccount57 b0 = new BankAccount57();
        BankAccount57 b1 = new BankAccount57("홍길동", 2000, 2.15);
        BankAccount57 b2 = new BankAccount57("성춘향", 500, 2.05);

        System.out.println("은행 계좌 모두의 정보입니다.");
        System.out.println(b0);
        System.out.println(b1);
        System.out.println(b2);

        Scanner scan = new Scanner(System.in);

        System.out.print("계좌 " + b0.getAccountNo() + "에 입금할 금액을 입력하세요: ");
        b0.deposit(scan.nextInt());

        System.out.println("은행 계좌 모두의 정보입니다.");
        System.out.println(b0);
        System.out.println(b1);
        System.out.println(b2);

        System.out.print("계좌 " + b1.getAccountNo() + "에서 출금할 금액을 입력하세요: ");
        b1.withdraw(scan.nextInt());

        System.out.println("은행 계좌 모두의 정보입니다.");
        System.out.println(b0);
        System.out.println(b1);
        System.out.println(b2);

        System.out.print("계좌 " + b1.getAccountNo() + "에서 계좌 " + b2.getAccountNo() + "로 송금할 금액을 입력하세요: ");
        BankAccount57.transfer(b1, b2, scan.nextInt());

        System.out.println("은행 계좌 모두의 정보입니다.");
        System.out.println(b0);
        System.out.println(b1);
        System.out.println(b2);

        scan.close();
    }
}


public class practice35 {

	public static void main(String[] args) {

        // 첫 번째 은행 계좌 정보 설정
        BankAccount account1 = new BankAccount();
        
        account1.name = "김상식";
        account1.accoutNo = "1234-5678";
        account1.balance = 100;
        account1.rate = 0.0;

        // 두 번째 은행 계좌 정보 설정
        BankAccount account2 = new BankAccount();
        account2.name = "홍길동";
        account2.accoutNo = "9999-2531";
        account2.balance = 2000;
        account2.rate = 2.15;

        // 첫 번째 은행 계좌 정보 출력
        System.out.println("첫 번째 은행 계좌의 정보입니다.");
        System.out.println("이름: " + account1.name);
        System.out.println("계좌 번호: " + account1.accoutNo);
        System.out.println("잔액: " + account1.balance + "원");
        System.out.println("이자율: " + account1.rate + "%");
        System.out.println();

        // 두 번째 은행 계좌 정보 출력
        System.out.println("두 번째 은행 계좌의 정보입니다.");
        System.out.println("이름: " + account2.name);
        System.out.println("계좌 번호: " + account2.accoutNo);
        System.out.println("잔액: " + account2.balance + "원");
        System.out.println("이자율: " + account2.rate + "%");
    }
}

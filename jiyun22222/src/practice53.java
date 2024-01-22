
public class practice53 {
    public static void main(String[] args) {
        BankAccount53 b1 = new BankAccount53();
        System.out.println("첫 번째 은행 계좌의 정보입니다.\n" + b1.toString());

        BankAccount53 b2 = new BankAccount53("김동덕", 100);
        System.out.println("\n두 번째 은행 계좌의 정보입니다.\n" + b2.toString());

        BankAccount53 b3 = new BankAccount53("홍길동", 2000, 2.15);
        System.out.println("\n세 번째 은행 계좌의 정보입니다.\n" + b3.toString());
    }
}

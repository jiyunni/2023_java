public class practice47 {
    public static void main(String[] args) {
        BankAccount47 account1 = new BankAccount47();
        account1.setName("김동덕");
        account1.setAccountNo("1234-5678");
        account1.setBalance(100);
        account1.setRate(0.0);

        BankAccount47 account2 = new BankAccount47();
        account2.setName("홍길동");
        account2.setAccountNo("9999-2531");
        account2.setBalance(2000);
        account2.setRate(2.15);

        System.out.println("첫 번째 은행 계좌의 정보입니다.");
        System.out.println(account1.toString());

        System.out.println("\n두 번째 은행 계좌의 정보입니다.");
        System.out.println(account2.toString());
    }
}

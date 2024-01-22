import java.util.Random;

public class BankAccount57 {
    private String name, accountNo;
    private int balance;
    private double interest;

    public BankAccount57() {
        this.name = "모름";
        this.balance = 0;
        this.interest = 0;
        this.accountNo = makeID();
    }

    public BankAccount57(String name, int balance) {
        this();
        this.name = name;
        this.balance = balance;
    }

    public BankAccount57(String name, int balance, double interest) {
        this.name = name;
        this.balance = balance;
        this.interest = interest;
        this.accountNo = makeID();
    }

    public boolean deposit(int money) {
        if (money < 0) {
            System.out.println("입금이 실패했습니다. (음수 금액)");
            return false;
        }
        balance += money;
        System.out.println("입금이 성공했습니다.");
        return true;
    }

    public boolean withdraw(int money) {
        if (money < 0 || balance < money) {
            System.out.println("출금이 실패했습니다. (음수 금액 또는 잔고 부족)");
            return false;
        }
        balance -= money;
        System.out.println("출금이 성공했습니다.");
        return true;
    }

    public static boolean transfer(BankAccount57 from, BankAccount57 to, int money) {
        if (from.withdraw(money)) {
            to.deposit(money);
            System.out.println("송금이 성공했습니다.");
            return true;
        } else {
            System.out.println("송금이 실패했습니다.");
            return false;
        }
    }

    public String getAccountNo() {
        return accountNo;
    }

    private String makeID() {
        Random rand = new Random();
        int num1 = rand.nextInt(9000) + 1000;
        int num2 = rand.nextInt(9000) + 1000;
        return num1 + "-" + num2;
    }

    private int calcInterest() {
        return (int) (balance * interest / 100);
    }

    @Override
    public String toString() {
        int calculatedInterest = calcInterest();
        return "이름: " + name + "\n" +
               "계좌 번호: " + accountNo + "\n" +
               "잔액: " + balance + "원\n" +
               "이자율: " + interest + "%\n" +
               "이자: " + calculatedInterest + "원";
    }
}


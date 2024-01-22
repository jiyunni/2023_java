
import java.util.Random;

public class BankAccount53 {
    private String name, accountNo;
    private int balance;
    private double interest;

    public BankAccount53() {
        this.name = "모름";
        this.balance = 0;
        this.interest = 0;
        this.accountNo = makeID();
    }

    public BankAccount53(String name, int balance) {
        this();
        this.name = name;
        this.balance = balance;
    }

    public BankAccount53(String name, int balance, double interest) {
        this.name = name;
        this.balance = balance;
        this.interest = interest;
        this.accountNo = makeID();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
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

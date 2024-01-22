public class BankAccount47 {
    private String name, accountNo;
    private int balance;
    private double rate;

    // 설정자와 접근자 추가
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

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        int interest = calcInterest();
        return "이름: " + name + "\n" +
               "계좌 번호: " + accountNo + "\n" +
               "잔액: " + balance + "원\n" +
               "이자율: " + rate + "%\n" +
               "이자: " + interest + "원";
    }

    private int calcInterest() {
        // 잔액과 이자율을 이용하여 이자 계산
        return (int) (balance * rate / 100);
    }
}


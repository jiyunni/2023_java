class Account{
	private int regNumber;
	private String name;
	private int balance;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
	
}
public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(10000);
		
		System.out.println("name is "+obj.getName()+"my money is "+obj.getBalance());		

	}

}

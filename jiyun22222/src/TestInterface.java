interface RemoteControl{
	void turnon();
	void turnoff();
	public default void printBrand() {System.out.println("Remote Control possible TV");}
}

class TV implements RemoteControl{
	boolean on;
	public void turnon() {
		on = true;
		System.out.println("Tv is turn on");
	}
	public void turnoff() {
		on = false;
		System.out.println("TV is turn off");
	}
	public void printBrand() {System.out.println("power java TV");}
}
public class TestInterface {

	public static void main(String[] args) {
		TV obj = new TV();
		
		System.out.println(obj.getClass().getName());
		obj.turnon();
		obj.turnoff();
		obj.printBrand();

	}

}

interface Drivable {void drive();}
interface Flyable {void fly();}


public class Flycar implements Drivable, Flyable{
	public void drive() {
		System.out.println("driving");
	}
	public void fly() {
		System.out.println("drive");
	}
	
	public static void main(String args[]) {
		Flycar obj = new Flycar();
		obj.drive();
		obj.fly();
	}

}

class Base{
	public Base() {
		System.out.println("Base()");
	}
}

class Derived extends Base{
	public Derived() {
		super();
		System.out.println("Derived()");
	}
}
public class Test {

	public static void main(String[] args) {
		Derived r = new Derived();
		

	}

}

class Base{
	public void Base() {
		System.out.println("Base()");	}
}

class Derived extends Base{

	public void Derived() {
		System.out.println("Derived()");
		super.Base();
	}
}
public class Testt {

	public static void main(String[] args) {
		Derived r = new Derived();
		r.Base();

	}}

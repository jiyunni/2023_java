class Shapee{
	public void getArea() {
		System.out.println("0");
	}
	public Shapee() {
		super(); //object
	}
}

class Rectan extends Shapee{
	private double width, height;
	public Rectan(double width, double height) {
		super();
		this.width=width;
		this.height=height;
	}
	
	public void getArea() {
		System.out.println(width*height);
	}
}
public class shapeareatest {

	public static void main(String[] args) {
		Shapee obj = new Rectan(2.0, 3.0);
		obj.getArea();

	}

}

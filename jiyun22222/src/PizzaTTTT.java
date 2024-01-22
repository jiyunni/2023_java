class Pizzaa{
	private String toppings;
	private int radius;
	static final double PI=3.141592;
	static int count=0;
	
	public Pizzaa(String toppings) {
		this.toppings = toppings;
		count++;
	}
}
public class PizzaTTTT {

	public static void main(String[] args) {
		Pizzaa p1 = new Pizzaa("abc");
		Pizzaa p2 = new Pizzaa("abc");
		Pizzaa p3 = new Pizzaa("abc");
		
		int n = Pizzaa.count;
		System.out.println(n); 
		

	}

}

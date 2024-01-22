class Pizza{
	int radius;
	
	public Pizza(int r) {
		this.radius = r;
	}
	public Pizza whosLargest(Pizza p1, Pizza p2) {
		if(p1.radius > p2.radius)
			return p1;
		else
			return p2;
		
	}
}
public class pizzaTest {

	public static void main(String[] args) {
		Pizza obj1 = new Pizza(10);
		Pizza obj2 = new Pizza(18);
		
		Pizza Largest = obj2.whosLargest(obj1, obj2);
		System.out.println(Largest.radius );

	}

}

class Pizza {
	int size;
	String type;
	
	public Pizza() {
		size =12;
		type="super";				
	}
	
	public Pizza(int s, String t) {
		size =s;
		type =t;
	}
}
public class PizzaTest {

	public static void main(String[] args) {
		Pizza obj1 = new Pizza();
		System.out.println("("+obj1.type+","+obj1.size+")");
		
		Pizza obj2= new Pizza(24, "potatoes");
		System.out.println("("+obj2.type+","+obj2.size+")");
		

	}

}

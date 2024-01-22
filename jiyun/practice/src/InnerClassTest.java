class Outerclass{
	private int value =10;
	
	class Innerclass{
		public void myMethod(){
			System.out.println(value);
		}
	}
	Outerclass() {
		Innerclass obj = new Innerclass();
		obj.myMethod();
		
	}
}
public class InnerClassTest {

	public static void main(String[] args) {
		Outerclass outer = new Outerclass();

	}

}

class LocalInner{
	private int data = 30;
	
	void display() {
		final String msg = "now data value:";
		
		class Local{
			void printMsg() {
				System.out.println(msg + data);
	
			}
		}
		Local obj = new Local();
		obj.printMsg();
	}
}
public class LocalInnerTest {
	public static void main(String[] args) {
		LocalInner obj = new LocalInner();
		obj.display();
		

	}

}

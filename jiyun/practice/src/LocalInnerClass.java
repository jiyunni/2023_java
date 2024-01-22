class localInner{
	private int data = 30;
	
	void display() {
		final String msg = "now data";
		
		class Local{
			void printMsg() {
				System.out.println(msg+data);
			}
		}
		Local obj = new Local();
		obj.printMsg();
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
		localInner obj = new localInner();
		obj.display();

	}

}

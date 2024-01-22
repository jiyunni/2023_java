class Em{
	public int basesal = 30000;
	int getsal() {
		return basesal;
	}
}
class Man extends Em{
	int getsal() {
		return basesal+20000;
	}
}

class program extends Em{
	int getsal() {
		return basesal+10000000;
	}
}
public class EmTest {

	public static void main(String[] args) {
		Man obj1 = new Man();
		program obj2 = new program();
		
		System.out.println(obj1.getsal());
		System.out.println(obj2.getsal());
		

	}

}

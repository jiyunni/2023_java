import java.util.ArrayList;

class Pe{
	String name;
	String tel;
	
	public Pe(String name, String tel) {
		this.name= name;
		this.tel = tel;
	}
}

public class ArrayListTest {

	public static void main(String[] args) {
		
		
		ArrayList<Pe> pp = new ArrayList<Pe>();
		pp.add(new Pe("lee", "0000"));

	}

}

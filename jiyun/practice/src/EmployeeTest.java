class per{
	String name;
	public per() {
		System.out.println("fuck");
	}
	public per(String thename) {
		this.name=thename;
	}
}

class Emplo extends per{
	String id;
	public Emplo() {
	}
	public Emplo(String name) {
		super(name);
	}
	public Emplo(String name,String id) {
		super(name);
		this.id = id;
	}
	
	public String toString() {
		return "["+id+","+name+"]";
	}
}
public class EmployeeTest {

	public static void main(String[] args) {
		Emplo obj1 = new Emplo();
		Emplo obj = new Emplo("kim","2021");
		System.out.println(obj);
	

	}

}


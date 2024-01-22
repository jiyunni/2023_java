interface Employable{
	String getName();
	
	static boolean isEmpty(String str) {
		if (str==null || str.trim().length()==0)
			return true;
		else
			return false;
	}
}

class Employee implements Employable{
	private String name;
	
	public Employee(String name) {
		if(Employable.isEmpty(name)==true)
			throw new RuntimeException("r u crazy?");
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
public class stacticmethod {

	public static void main(String[] args) {
		Employable obj = new Employee("Hong");
		obj.getName();

	}

}

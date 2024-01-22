interface Employable{
	String getName();
	
	static boolean isEmpty(String str) {
		if(str==null||str.trim().length()==0) {
			return true;
		}else {
			return false;
		}
	}
}

class Emplo implements Employable{
	private String name;
	
	public Emplo(String name) {
		if(Employable.isEmpty(name)==true)
			throw new RuntimeException("fill the name");
		this.name = name;
	}
	public String getName() {return this.name;}
}
public class staticmethodtest {

	public static void main(String[] args) {
		Employable emp1 = new Emplo("jiyoun");

	}

}

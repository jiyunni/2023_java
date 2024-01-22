class D {
	private int year, month, date;
	
	public D(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
		
	}
	
	public String toString() {
		return year+"."+month+"."+date;
	}
} 

class E{
	private String name;
	private D birthdate;
	
	public E(String name, D birthDate) {
		this.name = name;
		this.birthdate = birthdate;
	}
	
	public String toString() {
		return name+","+birthdate;
	}
}
public class EmployeeTestt {
	public static void main(String[]args) {
		D birth = new D(2002,05,11);
		E em = new E("lee", birth);
		System.out.println(em);
	}

}

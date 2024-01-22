class Person{
	private String regnumber;
	private double weight;
	protected int age;
	String name;
	
	public double getweight() {
		return weight;
	}
	public void setweight(double weight) {
		this.weight = weight;
	}
}

class Student extends Person{
	int id;
}
public class StudentTest {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.setweight(48.5);
		obj.name = "lee";
		obj.age = 22;

	}

}

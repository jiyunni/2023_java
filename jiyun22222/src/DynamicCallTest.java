class Animal{
	void speak() {	System.out.println("Animal class sound()");	}
}	
class Dog extends Animal{
	void speak() {System.out.println("mung mung");}
	
}
class Cat extends Animal{
	void speak() {System.out.println("mow");}
}
public class DynamicCallTest {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Animal();
		
		a1.speak();
		a2.speak();
		a3.speak();
		

	}

}

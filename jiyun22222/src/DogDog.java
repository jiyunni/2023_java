class Animals{
	public static void A() {
		System.out.println("static method in Animal");
	}
}
public class DogDog extends Animals{
	public static void A() {
		System.out.println("static method in dogdog");
	}

	public static void main(String[] args) {
		DogDog dog = new DogDog();
		Animals a = dog;
		Animals b = new Animals();
		
		a.A();
		b.A();
		dog.A();
		

	}

}

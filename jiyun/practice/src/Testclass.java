interface Drawable{
	void draw();
	public default void getsize() {
		System.out.println("100.100");
	}
}

class circle implements Drawable{
	public void draw() {
		System.out.println("circle draw");
	}
	/*
	public void getsize() {
		System.out.println("200.200");
	}
	*/
}
public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable aa = new circle();
		aa.draw();
		aa.getsize();

	}

}

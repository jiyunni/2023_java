abstract class Sha{
	int x, y;
	public void translate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw();
};

class Re extends Sha{
	int width, height;
	public void draw() {System.out.println("Rectangle draw method");}
};

class Circle extends Sha{
	int radius;
	public void draw() {System.out.println("circle draw method");}
};

public class AbstractTest {

	public static void main(String[] args) {
		Sha s2 = new Circle();
		s2.draw();
		Re s3 = new Re();
		s3.draw();
	}
};
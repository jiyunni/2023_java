interface operatecar{
	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
}


public class AutoCar implements operatecar {
	public void start() {
		System.out.println("start");
	}
	public void setSpeed(int speed) {
		System.out.println(speed);
	}
	public void stop() {
		System.out.println("Stop");
	}
	public void turn(int degree) {
		System.out.println(degree);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operatecar obj = new AutoCar();
		obj.setSpeed(100);
		obj.stop();
		

	}

}

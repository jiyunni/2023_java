interface remote{
	public void turnon();
	public void turnoff();
	public default void printBrand() {System.out.println("remote control Tv");}
}
public class Tv implements remote {
	boolean on;
	public void turnon() {
		on=true;
		System.out.println("turnon");		
			

	}
	public void turnoff() {
		on=false;
		System.out.print("turnoff");
		

	}
	public void printBrand() {System.out.println("power Tv");}
	
}


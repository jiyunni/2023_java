class DeskLamp{
	private boolean ison;
	
	//메소드 정의
	public void turnon()	{ison = true;}
	public void turnoff()	{ison = false;}
	public String toString()	{
		return "현재 상태는 " + (ison == true? "켜짐" : "꺼짐");
	}
	}
	
public class DeskLampTest {

	public static void main(String[] args) {
		
		DeskLamp myLamp = new DeskLamp();
		
		myLamp.turnon();
		System.out.println(myLamp);
		myLamp.turnoff();
		System.out.println(myLamp);
	
	}

}

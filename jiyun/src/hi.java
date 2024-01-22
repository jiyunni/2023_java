import java.util.*;


public class hi {
	
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("scissor(0), rock(1), paper(2):");
		int user = sc.nextInt();
		
		int computer = (int)(Math.random()*3);
		if( user == computer )
			System.out.println("same computer & you");
		
		else if ( user == (computer +1)%3)
			System.out.println("you:"+user+"computer:"+ computer +"you win");
		else
			System.out.println("you:"+user+"computer:"+ computer +"computer win");
		
		

	}

}

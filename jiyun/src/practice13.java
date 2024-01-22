import java.util.Scanner;

public class practice13 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("x 값을 입력하세요:");
		double x = s1.nextDouble();
		double result;
		
		if (x>0)
			{result = 7*x +2;}
			
		else
			{result = x*x*x - 9*x +2;}
			
		
		System.out.println("f(x)=" + result );
			

	}

}

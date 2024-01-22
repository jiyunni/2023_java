import java.util.Scanner;

public class practice12 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요:");
		int num1 = s1.nextInt();
		System.out.println("두 번째 숫자를 입력하세요r:");
		int num2 = s1.nextInt();
		System.out.println("세 번째 숫자를 입력하세요:");
		int num3 = s1.nextInt();
		
		int min = num1;
		
		if (num2< min)
			{min = num2;}
			
		if (num3 < min)
			{min = num3;}
			
		System.out.println("가장 작은 숫자는 " + min + " 입니다.");
		
		
		
		
		
		
		
	}

}

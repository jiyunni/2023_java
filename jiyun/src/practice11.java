import java.util.Scanner;

public class practice11 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("키를 입력하세요:");
		double H = s1.nextDouble();
		System.out.println("몸무게를 입력하세요:");
		double W = s1.nextDouble();
		
		double avg =(H-100)*(0.9);
		System.out.println("표준체중은 "+ avg + " 입니다.");
		
		
		if (avg > W)
			System.out.println("저체중 입니다.");
		
		else if (avg < W)
			System.out.println("과체중 입니다.");
		
		else
			System.out.println("정상체중 입니다.");
		
		
	}

}

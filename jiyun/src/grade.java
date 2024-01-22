
import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		int score;
		
		Scanner sc =new Scanner(System.in);
		System.out.print("input_your_score");
		score = sc.nextInt();
		
		if(score >= 90)
			System.out.println("grade_A");
			
		else if (score >=80)
			System.out.println("grade_B");
			
		else if (score >=70)
			System.out.println("grade_c");
		
		else if (score >= 60)
			System.out.println("grade_D");
		
		else
			System.out.println("grade_F");
			
		
		

	}

}

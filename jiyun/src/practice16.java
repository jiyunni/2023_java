import java.util.Scanner;

public class practice16 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요:");
		int A = s1.nextInt();
		
		int count =0 ;
		
		   for (int i = 0; i <= A; i++) {
	            if (i % 3 == 0) {
	                System.out.print(i + " ");
	                count++;

	                if (count == 5) {
	                    System.out.println();
	                    count = 0;
	                }
	            }
	        }

		

		

	}

}

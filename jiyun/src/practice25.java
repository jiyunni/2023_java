import java.util.Scanner;

public class practice25 {

	public static void main(String[] args) {

        // int number = getValidInput();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int number = scanner.nextInt();
		
        if (number > 0) {
            printTimes(number);
        } else {
        	 while(true) {
        	System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        	if (number > 0)	break;
        	
        	 }
            
        }
    }
/*
    public static int getValidInput() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("정수를 입력하세요: ");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            } else {
                validInput = true;
            }
        }

        return number;
    }
    */

    public static void printTimes(int n) {
        System.out.println("구구단 " + n + "단입니다.");
        for (int i = 1; i <= 9; i++) {
            int result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }
}

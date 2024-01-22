import java.util.Scanner;

public class anksu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		do {
			System.out.print("what's montth[1-12]:");
			month = sc.nextInt(); }
		while (month < 1 || month >12);
		System.out.println("month(user input) is "+ month);
		}

	}



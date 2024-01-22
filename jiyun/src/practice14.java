import java.util.Scanner;

public class practice14 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요:");
		char s = s1.next().charAt(0);
		

        switch (Character.toUpperCase(s)) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("모음입니다.");
                break;
            default:
                System.out.println("자음입니다.");
        }
	

	}

}


//switch case -> a i o u e
//switch case -> A I O U E

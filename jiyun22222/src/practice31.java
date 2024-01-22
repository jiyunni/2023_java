import java.util.Scanner;

public class practice31 {

	public static void main(String[] args) {
		

        Date birthday = new Date();

        // Scanner를 이용하여 입력 받은 값을 객체의 소속변수에 대입
        Scanner scanner = new Scanner(System.in);

        // 년도 입력
        System.out.print("태어난 년도를 입력하세요: ");
        birthday.year = scanner.nextInt();

        // 월 입력
        System.out.print("태어난 월을 입력하세요: ");
        birthday.month = scanner.nextInt();

        // 날짜 입력
        System.out.print("태어난 날짜를 입력하세요: ");
        birthday.day = scanner.nextInt();

        // 입력 받은 값 출력
        System.out.println("당신의 생일은 " + birthday.year + "년 " + birthday.month + "월 " + birthday.day + "일입니다.");

        // 스캐너 닫기
        scanner.close();
    }
}

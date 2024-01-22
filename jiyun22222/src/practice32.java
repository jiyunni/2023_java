import java.util.Scanner;

public class practice32 {
    public static void main(String[] args) {
        // birthday 객체 생성
        Date birthday = new Date();

        // 입력 받은 생일 정보 저장
        Scanner scanner = new Scanner(System.in);

        System.out.print("태어난 년도를 입력하세요: ");
        birthday.year = scanner.nextInt();

        System.out.print("태어난 월을 입력하세요: ");
        birthday.month = scanner.nextInt();

        System.out.print("태어난 날짜를 입력하세요: ");
        birthday.day = scanner.nextInt();

        // 입력 받은 생일 정보 출력
        System.out.println("당신의 생일은 " + birthday.year + "년 " + birthday.month + "월 " + birthday.day + "일입니다.");

        // adultday 객체 생성 및 성년기준일 계산하여 대입
        Date adultday = new Date();
        adultday.year = birthday.year + 20;
        adultday.month = birthday.month;
        adultday.day = birthday.day;

        // 성년기준일 출력
        System.out.println("당신의 성년일은 " + adultday.year + "년 " + adultday.month + "월 " + adultday.day + "일입니다.");

        // 다시 생일 출력
        System.out.println("당신의 생일은 " + birthday.year + "년 " + birthday.month + "월 " + birthday.day + "일입니다.");

        // 스캐너 닫기
        scanner.close();
    }
}


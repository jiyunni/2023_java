import java.util.Scanner;

public class practice42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Date42 객체 생성
        Date42 birthday = new Date42();

        // 태어난 년도 설정
        System.out.print("태어난 년도를 입력하세요: ");
        birthday.setYear(scanner.nextInt());

        // 태어난 월 설정
        System.out.print("태어난 월을 입력하세요: ");
        birthday.setMonth(scanner.nextInt());

        // 태어난 날짜 설정
        System.out.print("태어난 날짜를 입력하세요: ");
        birthday.setDay(scanner.nextInt());

        // 생일 출력
        System.out.println("당신의 생일은 " + birthday.toString() + "입니다.");

        // 성년일 계산 및 출력
        Date42 adultDay = new Date42();
        adultDay.setYear(birthday.year + 20);
        adultDay.setMonth(birthday.month);
        adultDay.setDay(birthday.day);

        System.out.println("당신의 성년일은 " + adultDay.toString() + "입니다.");

        // 다시 생일 출력
        System.out.println("당신의 생일은 " + birthday.toString() + "입니다.");

        scanner.close();
    }
}

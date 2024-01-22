import java.util.Scanner;

public class practice40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 생일에 대한 Date40 객체 생성
        Date40 birthday = new Date40();

        // 생일에 대한 값 입력
        System.out.print("태어난 년도를 입력하세요: ");
        birthday.year = scanner.nextInt();
        System.out.print("태어난 월을 입력하세요: ");
        birthday.month = scanner.nextInt();
        System.out.print("태어난 날짜를 입력하세요: ");
        birthday.day = scanner.nextInt();

        // 생일 메시지 출력
        System.out.println(birthday.toString(false));

        // 성년일에 대한 Date40 객체 생성 (생일을 기준으로)
        Date40 adultDay = new Date40();
        adultDay.year = birthday.year + 20; // 성년은 20세를 기준으로 가정
        adultDay.month = birthday.month;
        adultDay.day = birthday.day;

        // 성년일 메시지 출력
        System.out.println(adultDay.toString(true));

        // 다시 생일 메시지 출력
        System.out.println(birthday.toString(false));

        scanner.close();
    }
}



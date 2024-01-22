
import java.util.Scanner;

public class practice48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 입력 받기
        System.out.print("태어난 년도를 입력하세요: ");
        int birthYear = scanner.nextInt();
        System.out.print("태어난 월을 입력하세요: ");
        int birthMonth = scanner.nextInt();
        System.out.print("태어난 날짜를 입력하세요: ");
        int birthDay = scanner.nextInt();

        // Date48 객체 생성 및 설정자 메소드 호출
        Date48 birthDate = new Date48();
        birthDate.setYear(birthYear);
        birthDate.setMonth(birthMonth);
        birthDate.setDay(birthDay);

        // 결과 출력
        System.out.println("당신의 생일은 " + birthDate + "입니다.");

        // 성년일 계산
        int adulthoodYear = birthYear + 20;
        System.out.println("당신의 성년일은 " + adulthoodYear + "년 " + birthMonth + "월 " + birthDay + "일입니다.");

        scanner.close();
    }
}

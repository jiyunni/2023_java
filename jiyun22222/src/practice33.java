import java.util.Scanner;

public class practice33 {
    public static void main(String[] args) {
        // Rectangle 클래스 객체 생성
        Rectangle rectangle = new Rectangle();

        // Scanner를 이용하여 입력 받은 값을 객체의 소속변수에 대입
        Scanner scanner = new Scanner(System.in);

        // 가로 입력
        System.out.print("가로 입력: ");
        rectangle.width = scanner.nextInt();

        // 세로 입력
        System.out.print("세로 입력: ");
        rectangle.height = scanner.nextInt();

        // 입력 받은 값으로 면적 및 둘레 계산 및 출력
        System.out.println("면적은 " + (rectangle.width * rectangle.height) + "입니다.");
        System.out.println("둘레는 " + (2 * (rectangle.width + rectangle.height)) + "입니다.");

        // 스캐너 닫기
        scanner.close();
    }
}


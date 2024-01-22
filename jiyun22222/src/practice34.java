import java.util.Scanner;



public class practice34 {
    public static void main(String[] args) {
        // Rectangle 클래스 객체 2개 생성
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        // Scanner를 이용하여 첫 번째 사각형의 정보 입력
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 사각형의 정보를 입력하세요.");
        System.out.print("가로 입력: ");
        rectangle1.width = scanner.nextInt();
        System.out.print("세로 입력: ");
        rectangle1.height = scanner.nextInt();

        // Scanner를 이용하여 두 번째 사각형의 정보 입력
        System.out.println("두 번째 사각형의 정보를 입력하세요.");
        System.out.print("가로 입력: ");
        rectangle2.width = scanner.nextInt();
        System.out.print("세로 입력: ");
        rectangle2.height = scanner.nextInt();

        // 첫 번째 사각형의 면적 및 둘레 계산 및 출력
        System.out.println("첫 번째 사각형의 면적은 " + (rectangle1.width * rectangle1.height) + "입니다.");
        System.out.println("첫 번째 사각형의 둘레는 " + (2 * (rectangle1.width + rectangle1.height)) + "입니다.");

        // 두 번째 사각형의 면적 및 둘레 계산 및 출력
        System.out.println("두 번째 사각형의 면적은 " + (rectangle2.width * rectangle2.height) + "입니다.");
        System.out.println("두 번째 사각형의 둘레는 " + (2 * (rectangle2.width + rectangle2.height)) + "입니다.");

        // 스캐너 닫기
        scanner.close();
    }
}


import java.util.Scanner;

public class practice41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rectangle41 객체 생성
        Rectangle41 rectangle = new Rectangle41();

        // 가로 입력
        System.out.print("가로 입력: ");
        rectangle.width = scanner.nextInt();

        // 세로 입력
        System.out.print("세로 입력: ");
        rectangle.height = scanner.nextInt();

        // 넓이 계산 및 출력
        int area = rectangle.area();
        System.out.println("면적은 " + area + "입니다.");

        // 둘레 계산 및 출력
        int perimeter = rectangle.perimeter();
        System.out.println("둘레는 " + perimeter + "입니다.");

        scanner.close();
    }
}

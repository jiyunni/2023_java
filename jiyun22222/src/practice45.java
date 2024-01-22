import java.util.Scanner;

public class practice45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle45 rectangle = new Rectangle45();

        // 사용자로부터 가로 및 세로 입력 받기
        System.out.print("사각형의 가로를 입력하세요: ");
        int width = scanner.nextInt();
        rectangle.setWidth(width);

        System.out.print("사각형의 세로를 입력하세요: ");
        int height = scanner.nextInt();
        rectangle.setHeight(height);

        // 정보 출력
        System.out.println("사각형의 가로는 " + rectangle.getWidth() + "이고, 세로는 " + rectangle.getHeight() + "입니다.");
        System.out.println("사각형의 넓이는 " + rectangle.area() + "이고, 둘레는 " + rectangle.perimeter() + "입니다.");

        scanner.close();
    }
}

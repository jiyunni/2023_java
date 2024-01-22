import java.util.Scanner;

public class practice21 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 첫 번째 정수 입력
        System.out.print("정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        // 두 번째 정수 입력
        System.out.print("정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        // sum 메소드 호출
        sum(num1, num2);

        // 순서를 바꾼 sum 메소드 호출
        sum(num2, num1);
    }

    public static void sum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}

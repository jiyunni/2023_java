import java.util.Scanner;

public class practice24 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 정수 입력
        System.out.print("정수를 입력하세요: ");
        int number = scanner.nextInt();

        // printTimes 메소드 호출
        printTimes(number);
    }

    public static void printTimes(int n) {
        System.out.println("구구단 " + n + "단 입니다.");
        for (int i = 1; i <= 9; i++) {
            int result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }
}

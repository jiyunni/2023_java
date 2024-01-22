import java.util.Scanner;

public class practice22 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 정수 입력
        System.out.print("정수를 입력하세요: ");
        int num = scanner.nextInt();

        // abs 메소드 호출하여 절대값 구하기
        int absoluteValue = abs(num);

        // 결과 출력
        System.out.println("입력된 정수 " + num + "의 절대값은 " + absoluteValue + "입니다.");
    }

    public static int abs(int number) {
        // 입력된 정수의 절대값을 계산하여 반환
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
    }
}

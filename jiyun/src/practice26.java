import java.util.Scanner;

public class practice26 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "번째 숫자를 입력하세요: ");
            num[i] = scanner.nextInt();
        }

        System.out.println("입력된 숫자는 다음과 같습니다.");
        for (int number : num) {
            System.out.print(number);
        }
     
        
        System.out.println();

        System.out.println("역순 출력입니다.");
        for (int i = 4; i >= 0; i--) {
            System.out.print(num[i]);
        }
        System.out.println();

        int max = num[0];
        for (int number : num) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("가장 큰 수는 " + max + "입니다.");
    }
}
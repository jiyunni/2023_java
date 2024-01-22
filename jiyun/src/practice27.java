import java.util.Scanner;


public class practice27 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5]; // 입력된 정수를 저장하는 배열
        int[] cnt = new int[10]; // 각 숫자별 횟수를 저장하는 배열

        // 배열 cnt의 각 원소를 0으로 초기화
        for (int i = 0; i < cnt.length; i++) {
            cnt[i] = 0;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "번째 숫자를 입력하세요: ");
            int number = scanner.nextInt();
            num[i] = number;
            cnt[number]++;
        }

        System.out.print("입력된 숫자는 다음과 같습니다. " + "\n");
        for (int number : num) {
            System.out.print(number);
        }
        System.out.println();

        System.out.println("역순 출력입니다.");
        for (int i = num.length - 1; i >= 0; i--) {
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

        System.out.println("각 숫자 별로 입력된 횟수는 다음과 같습니다.");
        for (int i = 0; i < cnt.length; i++) {
            System.out.println("숫자" + i + ": " + cnt[i] + "번");
        }

        System.out.println("가장 큰 수는 " + max + "이고 배열 내에 " + cnt[max] + "번 나타납니다.");
    }
}

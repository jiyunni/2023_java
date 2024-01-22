import java.util.Scanner;

public class practice44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원하는 기능을 선택하세요(1-정수, 2-실수) : ");
        int choice = scanner.nextInt();

        Average averageCalculator = new Average();

        if (choice == 1) {
            System.out.print("평균값을 원하는 정수의 개수를 입력하세요: ");
            int count = scanner.nextInt();

            if (count == 2) {
                System.out.print("1번 정수를 입력하세요: ");
                int a = scanner.nextInt();
                System.out.print("2번 정수를 입력하세요: ");
                int b = scanner.nextInt();
                double result = averageCalculator.getAverage(a, b);
                System.out.println(count + "개 정수의 평균은 " + result + "입니다.");
            } else if (count == 3) {
                System.out.print("1번 정수를 입력하세요: ");
                int a = scanner.nextInt();
                System.out.print("2번 정수를 입력하세요: ");
                int b = scanner.nextInt();
                System.out.print("3번 정수를 입력하세요: ");
                int c = scanner.nextInt();
                double result = averageCalculator.getAverage(a, b, c);
                System.out.println(count + "개 정수의 평균은 " + result + "입니다.");
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        } else if (choice == 2) {
            System.out.print("평균값을 원하는 실수의 개수를 입력하세요: ");
            int count = scanner.nextInt();

            if (count == 2) {
                System.out.print("1번 실수를 입력하세요: ");
                double a = scanner.nextDouble();
                System.out.print("2번 실수를 입력하세요: ");
                double b = scanner.nextDouble();
                double result = averageCalculator.getAverage(a, b);
                System.out.println(count + "개 실수의 평균은 " + result + "입니다.");
            } else if (count == 3) {
                System.out.print("1번 실수를 입력하세요: ");
                double a = scanner.nextDouble();
                System.out.print("2번 실수를 입력하세요: ");
                double b = scanner.nextDouble();
                System.out.print("3번 실수를 입력하세요: ");
                double c = scanner.nextDouble();
                double result = averageCalculator.getAverage(a, b, c);
                System.out.println(count + "개 실수의 평균은 " + result + "입니다.");
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        } else {
            System.out.println("잘못된 입력입니다.");
        }

        scanner.close();
    }
}

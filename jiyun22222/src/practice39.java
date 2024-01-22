import java.util.Scanner;

public class practice39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("태어난 년도를 입력하세요: ");
        int birthYear = scanner.nextInt();

        System.out.print("태어난 월을 입력하세요: ");
        int birthMonth = scanner.nextInt();

        System.out.print("태어난 날짜를 입력하세요: ");
        int birthDay = scanner.nextInt();

        Date39 birthday = new Date39(birthYear, birthMonth, birthDay);

        System.out.println("당신의 생일은 ");
        birthday.print();

        int adultYear = birthYear + 20;
        Date39 adultDay = new Date39(adultYear, birthMonth, birthDay);

        System.out.println("당신의 성년일은 ");
        adultDay.print();

        System.out.println("당신의 생일은 ");
        birthday.print();

        scanner.close();
    }
}


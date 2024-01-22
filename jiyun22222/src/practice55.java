import java.util.Scanner;

public class practice55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Create Date objects and take user input
        Date55 d1 = Date_UserInput(scan, "첫 번째");
        Date55 d2 = Date_UserInput(scan, "두 번째");



        // Compare the dates using the static method
        int result = Date55.compareDate(d1, d2);

        // Display the result
        if (result == -1) {
            System.out.println("두 번째 날짜인 " + d2 + "이 앞선 날짜입니다.");
        } else if (result == 0) {
            System.out.println("두 날짜는 같은 날짜입니다.");
        } else {
            System.out.println("첫 번째 날짜인 " + d1 + "이 앞선 날짜입니다.");
        }

        // Close the scanner
        scan.close();
    }

    private static Date55 Date_UserInput(Scanner scan, String ordinal) {
        System.out.println(ordinal + " 날짜를 입력하세요.");
        System.out.print("년도: ");
        int year = scan.nextInt();

        System.out.print("월: ");
        int month = scan.nextInt();

        System.out.print("일: ");
        int day = scan.nextInt();

        return new Date55(year, month, day);
    }
}


import java.util.Scanner;

public class practice23 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 이름 입력
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        // greeting 메소드 호출
        greeting(name);
    }

    public static void greeting(String name) {
        System.out.println(name + "씨, 좋은 아침입니다.");
    }
}

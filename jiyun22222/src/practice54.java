
import java.util.Scanner;

public class practice54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Plane54 p1 = new Plane54(1030615,"보잉737",75);

        System.out.println("제주행 비행기의 정보를 입력하세요.");
        System.out.println(p1);
        
        System.out.println("현재까지 추가된 비행기는 모두 " + Plane54.getPlanes() + "대입니다.");


        Plane54 p2 = new Plane54(2464737, "보잉747", 150);


        System.out.println("서울행 비행기의 정보를 입력하세요.");
        System.out.println(p2);
        System.out.println("현재까지 추가된 비행기는 모두 " + Plane54.getPlanes() + "대입니다.");

        // Close the scanner
        scan.close();
    }
}

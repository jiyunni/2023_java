
import java.util.Scanner;

public class practice52 {
    public static void main(String[] args) {
        // Movie 객체 m0 생성 및 출력
        movie52 m0 = new movie52();
        System.out.println("디폴트 영화의 정보입니다.");
        System.out.println(m0.toString());
        System.out.println();

        // Movie 객체 m1 생성 및 정보 입력 후 출력
        movie52 m1 = new movie52();
        Scanner scanner = new Scanner(System.in);

        System.out.println("영화정보를 입력하세요.");
        System.out.print("영화제목은? ");
        String title = scanner.nextLine();
        m1.setTitle(title);

        System.out.print("감독은? ");
        String director = scanner.nextLine();
        m1.setDirector(director);

        System.out.print("제작년도는? ");
        int year = scanner.nextInt();
        m1.setYear(year);

        System.out.print("평점은? ");
        int score = scanner.nextInt();
        m1.setScore(score);
        System.out.println("");
        
        System.out.println("입력한 영화의 정보입니다.");
        System.out.println(m1.toString());
    }
}

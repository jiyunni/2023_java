import java.util.Scanner;

public class practice46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        movie46 movie = new movie46();

        System.out.println("영화정보를 입력하세요.");

        System.out.print("영화제목은? ");
        String title = scanner.nextLine();
        movie.setTitle(title);

        System.out.print("평점은? ");
        int score = scanner.nextInt();
        movie.setScore(score);

        // 버퍼 비우기
        scanner.nextLine();

        System.out.print("감독은? ");
        String director = scanner.nextLine();
        movie.setDirector(director);

        System.out.print("개봉 년도는? ");
        int year = scanner.nextInt();
        movie.setYear(year);

        System.out.println(movie.toString());

        scanner.close();
    }
}

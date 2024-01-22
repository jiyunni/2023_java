import java.util.Scanner;


public class practice36 {
    public static void main(String[] args) {
        // Movie 클래스 객체 2개 생성
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();

        // Scanner를 이용하여 첫 번째 영화 정보 입력
        Scanner scanner = new Scanner(System.in);
        System.out.println("영화정보를 입력하세요.");
        System.out.print("영화제목은? ");
        movie1.title = scanner.nextLine();
        System.out.print("평점은? ");
        movie1.score = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기
        System.out.print("감독은? ");
        movie1.director = scanner.nextLine();
        System.out.print("개봉 년도는? ");
        movie1.year = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        // Scanner를 이용하여 두 번째 영화 정보 입력
        System.out.println("영화정보를 입력하세요.");
        System.out.print("영화제목은? ");
        movie2.title = scanner.nextLine();
        System.out.print("평점은? ");
        movie2.score = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기
        System.out.print("감독은? ");
        movie2.director = scanner.nextLine();
        System.out.print("개봉 년도는? ");
        movie2.year = scanner.nextInt();

        // 영화 비교 및 출력
        compareAndPrint(movie1, movie2);

        // 스캐너 닫기
        scanner.close();
    }

    // 영화 비교 및 출력 메소드
    public static void compareAndPrint(Movie movie1, Movie movie2) {
        // 평점 비교
        if (movie1.score > movie2.score) {
            System.out.println("영화 " + movie1.title + "이(가) 영화 " + movie2.title + "보다 평점이 더 높습니다.");
        } else if (movie1.score < movie2.score) {
            System.out.println("영화 " + movie1.title + "이(가) 영화 " + movie2.title + "보다 평점이 더 낮습니다.");
        } else {
            System.out.println("영화 " + movie1.title + "이(가) 영화 " + movie2.title + "와 평점이 같습니다.");
        }

        // 개봉 년도 비교
        if (movie1.year < movie2.year) {
            System.out.println("영화 " + movie1.title + "이(가) 영화 " + movie2.title + "보다 먼저 개봉되었습니다.");
        } else if (movie1.year > movie2.year) {
            System.out.println("영화 " + movie1.title + "이(가) 영화 " + movie2.title + "보다 나중에 개봉되었습니다.");
        } else {
            System.out.println("영화 " + movie1.title + "이(가) 영화 " + movie2.title + "와 같은 년도에 개봉되었습니다.");
        }
    }
}

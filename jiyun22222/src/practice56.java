import java.util.Scanner;

public class practice56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Create Movie objects
        movie56 movie1 = movie_UserInput(scan);
        movie56 movie2 = movie_UserInput(scan);
        movie56 movie3 = movie_UserInput(scan);

        // Print the information about the movies
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);

        // Compare the movies using the static method
        System.out.println(movie56.compareMovies(movie1, movie2));
        System.out.println(movie56.compareMovies(movie1, movie3));
        System.out.println(movie56.compareMovies(movie2, movie3));

        // Close the scanner
        scan.close();
    }

    private static movie56 movie_UserInput(Scanner scan) {
        movie56 movie = new movie56();

        System.out.println("영화 정보를 입력하세요.");
        System.out.print("영화제목은? ");
        movie.setTitle(scan.next());

        System.out.print("감독은? ");
        movie.setDirector(scan.next());

        System.out.print("제작년도는? ");
        movie.setYear(scan.nextInt());

        return movie;
    }
}


import java.util.Random;

public class movie56 {
    private String mid, title, director;
    private int score, year;

    public movie56() {
        this.mid = makeID();
        this.title = "모름";
        this.director = "모름";
        this.year = -1;
        this.score = -1;
    }

    private String makeID() {
        Random random = new Random();
        int r1 = random.nextInt(9000) + 1000;
        int r2 = random.nextInt(9000) + 1000;
        return r1 + "-" + r2;
    }

    public String getMid() {
        return mid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "번호: " + mid + "\n" +
                "제목: " + title + "\n" +
                "감독: " + director + "\n" +
                "제작년도: " + year + "년";
    }

    public static String compareMovies(movie56 x, movie56 y) {
        if (compareDirector(x, y) && compareYear(x, y)) {
            return "영화"+x.mid +"와 영화"+y.mid+"는 감독이 같고 제작년도도 같습니다.";
        } else if (compareDirector(x, y)) {
            return "영화"+x.mid +"와 영화"+y.mid+"는 감독이 같고 제작년도가 다릅니다.";
        } else if (compareYear(x, y)) {
            return "영화"+x.mid +"와 영화"+y.mid+"는 감독이 다르고 제작년도도 같습니다.";
        } else {
            return "영화"+x.mid +"와 영화"+y.mid+"는 감독이 다르고 제작년도도 다릅니다.";
        }
    }

    private static boolean compareDirector(movie56 x, movie56 y) {
        return x.getDirector().equals(y.getDirector());
    }

    private static boolean compareYear(movie56 x, movie56 y) {
        return x.getYear() == y.getYear();
    }
}

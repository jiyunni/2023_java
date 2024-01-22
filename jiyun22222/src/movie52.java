import java.util.Random;

public class movie52 {
    private String mid, title, director;
    private int score, year;

    // 생성자
    public movie52() {
        this.mid = makeID();
        this.title = "모름";
        this.director = "모름";
        this.year = -1;
        this.score = -1;
    }

    // 영화번호 생성 메소드
    private String makeID() {
        Random random = new Random();
        int r1 = random.nextInt(9000) + 1000;
        int r2 = random.nextInt(9000) + 1000;
        return r1 + "-" + r2;
    }

    // 접근자와 설정자 메소드
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
               "제작년도: " + (year == -1 ? "-1년" : year + "년") + "\n" +
               "평점: " + (score == -1 ? "-1점" : score + "점");
    }
}


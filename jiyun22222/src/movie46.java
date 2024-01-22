public class movie46 {
    private String title, director;
    private int score, year;

    // 설정자와 접근자 추가
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "입력한 영화의 정보입니다.\n" +
               "제목: " + title + "\n" +
               "평점: " + score + "점\n" +
               "감독: " + director + "\n" +
               "개봉년도: " + year + "년";
    }
}

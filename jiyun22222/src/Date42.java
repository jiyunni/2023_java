public class Date42 {
    int year;
    int month;
    int day;

    // 설정자 메소드 추가
    public void setYear(int y) {
        year = y;
    }

    public void setMonth(int m) {
        month = m;
    }

    public void setDay(int d) {
        day = d;
    }

    public String toString() {
        return year + "년 " + month + "월 " + day + "일";
    }
}

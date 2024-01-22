public class Date43 {
    private int year;
    private int month;
    private int day;

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

    // 접근자 메소드 추가
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return year + "년 " + month + "월 " + day + "일";
    }
}


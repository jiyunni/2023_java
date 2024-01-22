public class Date40 {
    int year;
    int month;
    int day;

    public String toString(boolean isAdult) {
        if (isAdult) {
            return "당신의 성년일은 " + year + "년 " + month + "월 " + day + "일입니다.";
        } else {
            return "당신의 생일은 " + year + "년 " + month + "월 " + day + "일입니다.";
        }
    }
}

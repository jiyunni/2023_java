import java.util.*;

public class CalenderTest {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime()); // 현재 날짜와 시간 출력
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1); // 월은 0부터 시작 (0: 1월, 1: 2월, ..., 11: 12월)
        System.out.println(cal.get(Calendar.DATE));

        cal.set(Calendar.HOUR_OF_DAY, 12);
        cal.set(Calendar.MINUTE, 34);
        cal.set(Calendar.SECOND, 0);
        System.out.println(cal.getTime()); // 변경된 날짜와 시간 출력
    }
}

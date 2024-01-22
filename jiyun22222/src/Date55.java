
public class Date55 {
    private int year;
    private int month;
    private int day;

 
    public Date55() {
        this.year = 1900;
        this.month = 1;
        this.day = 1;
    }

 
    public Date55(int year, int month, int day) {
        this();
        setYear(year);
        setMonth(month);
        setDay(day);
    }


    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid month. Setting to default (1).");
            this.month = 1;
        }
    }

    public void setDay(int day) {
        if (isValidDay(day)) {
            this.day = day;
        } else {
            System.out.println("Invalid day. Setting to default (1).");
            this.day = 1;
        }
    }

    
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


    public static int compareDate(Date55 x, Date55 y) {
        if (x.getYear() < y.getYear() || (x.getYear() == y.getYear() && x.getMonth() < y.getMonth())
                || (x.getYear() == y.getYear() && x.getMonth() == y.getMonth() && x.getDay() < y.getDay())) {
            return -1;
        } else if (x.getYear() == y.getYear() && x.getMonth() == y.getMonth() && x.getDay() == y.getDay()) {
            return 0;
        } else {
            return 1;
        }
    }


    private boolean isValidDay(int day) {
        if (month == 2) {
            return (day >= 1 && day <= (isLeapYear() ? 29 : 28));
        } else {
            int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            return (day >= 1 && day <= daysInMonth[month - 1]);
        }
    }


    private boolean isLeapYear() {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}

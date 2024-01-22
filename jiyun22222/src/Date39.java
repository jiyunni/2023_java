public class Date39 {
 private int year;
 private int month;
 private int day;

 public Date39(int year, int month, int day) {
     this.year = year;
     this.month = month;
     this.day = day;
 }

 public void print() {
     System.out.printf("%04d년 %02d월 %02d일입니다.\n", year, month, day);
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
}

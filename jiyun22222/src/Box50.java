
//Box50 클래스
public class Box50 {
 private int x;
 private int y;
 private int z;
 private boolean empty;

 // 디폴트 생성자
 public Box50() {
     this(0, 0, 0);
     this.empty = true;
 }

 // 매개변수를 받는 생성자
 public Box50(int x, int y, int z) {
     this.x = x;
     this.y = y;
     this.z = z;
     this.empty = true;
 }

 // 설정자 및 접근자 메소드
 public void setX(int x) {
     this.x = x;
 }
 
 public void setY(int y) {
     this.y = y;
 }
 
 public void setZ(int z) {
     this.z = z;
 }

 public int getX() {
     return x;
 }


 public int getY() {
     return y;
 }

 public int getZ() {
     return z;
 }

 public void fillBox() {
     this.empty = false;
 }

 public void emptyBox() {
     this.empty = true;
 }

 @Override
 public String toString() {
     String result = "가로: " + x + "cm\n세로: " + y + "cm\n높이: " + z + "cm\n";
     result += empty ? "지금 박스는 비어 있습니다." : "지금 박스에는 물건이 들어 있습니다.";
     return result;
 }
}

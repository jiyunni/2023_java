
//Practice50 클래스
public class practice50 {
 public static void main(String[] args) {
     // 디폴트 박스 생성
     Box50 b0 = new Box50();
     System.out.println("디폴트 상자의 정보입니다.");
     System.out.println(b0.toString());
     System.out.println();

     // 첫 번째 박스 생성 및 소속변수에 값을 대입하여 출력
     Box50 b1 = new Box50();
     b1.setX(30);
     b1.setY(45);
     b1.setZ(53);
     b1.fillBox();
     System.out.println("첫 번째 상자의 정보입니다.");
     System.out.println(b1.toString());
     System.out.println();

     // 두 번째 박스 생성
     Box50 b2 = new Box50(100, 60, 20);
     System.out.println("두 번째 상자의 정보입니다.");
     System.out.println(b2.toString());
 }
}

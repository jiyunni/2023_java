
//Practice49 클래스
public class practice49 {
 public static void main(String[] args) {
     // 디폴트 비행기 생성 및 출력
     plane49 p0 = new plane49();
     System.out.println("디폴트 비행기의 정보입니다.");
     System.out.println(p0.toString());
     System.out.println();

     // 제주행 비행기 생성 및 설정자 호출 후 출력
     plane49 p1 = new plane49();
     p1.setId(1030615);
     p1.setModel("보잉 737");
     p1.setCapacity(75);
     System.out.println("제주행 비행기의 정보입니다.");
     System.out.println(p1.toString());
     System.out.println();

     // 서울행 비행기 생성 및 생성자 호출 후 출력
     plane49 p2 = new plane49(2464737, "보잉 747", 150);
     System.out.println("서울행 비행기의 정보입니다.");
     System.out.println(p2.toString());
 }
}


//Plane49 클래스
public class plane49 {
 private int id;
 private String model;
 private int capacity;

 // 디폴트 생성자
 public plane49() {
     this.id = 0;
     this.model = "모름";
     this.capacity = 0;
 }

 // 매개변수를 받는 생성자
 public plane49(int id, String model, int capacity) {
     this.id = id;
     this.model = model;
     this.capacity = capacity;
 }

 // 설정자 메소드
 public void setId(int id) {
     this.id = id;
 }

 public void setModel(String model) {
     this.model = model;
 }

 public void setCapacity(int capacity) {
     this.capacity = capacity;
 }

 // toString() 메소드 오버라이드
 @Override
 public String toString() {
     return "식별번호: " + id + "편\n모델: " + model + "\n승객수: " + capacity + "명";
 }
}

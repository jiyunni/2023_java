
public class practice37 {

	public static void main(String[] args) {

        // 디폴트 비행기 객체 생성
        Plane defaultPlane = new Plane();

        // 제주행 비행기 객체 생성
        Plane jejuPlane = new Plane(1030615, "보잉 737", 75);

        // 서울행 비행기 객체 생성
        Plane seoulPlane = new Plane(2464737, "보잉 747", 150);

        // 디폴트 비행기 정보 출력
        printPlaneInfo("디폴트 비행기의 정보입니다.", defaultPlane);

        // 제주행 비행기 정보 출력
        printPlaneInfo("제주행 비행기의 정보입니다.", jejuPlane);

        // 서울행 비행기 정보 출력
        printPlaneInfo("서울행 비행기의 정보입니다.", seoulPlane);
    }

    // 비행기 정보 출력 메소드
    public static void printPlaneInfo(String message, Plane plane) {
        System.out.println(message);
        System.out.println("식별번호: " + plane.id + "편");
        System.out.println("모델: " + plane.model);
        System.out.println("승객수: " + plane.capacity + "명");
        System.out.println();
    }
}

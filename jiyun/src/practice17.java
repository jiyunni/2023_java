
public class practice17 {

	public static void main(String[] args) {

        // 바깥쪽 반복문: 구구단의 단 수를 결정
        for (int i = 1; i <= 10; i++) {
            // 안쪽 반복문: 각 단의 곱셈 결과값을 출력
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.print(result + "\t"); // 결과값 출력 후 탭으로 구분
            }
            System.out.println(); // 각 단을 출력한 후 줄바꿈
        }
		

	}

}

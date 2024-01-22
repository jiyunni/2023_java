
public class practice18 {

	public static void main(String[] args) {
	    // 바깥쪽 반복문: 구구단의 단 수를 결정
    for (int i = 2; i <= 9; i++) {
        

        // 안쪽 반복문: 각 단의 곱셈을 계산하고 출력
        for (int j = 1; j <= 9; j++) {
            int result = i * j;
            System.out.println(i + " * " + j + " = " + result);
        }

        // 한 단을 출력한 후 빈 줄 추가
    System.out.println();
    }

}
	
}

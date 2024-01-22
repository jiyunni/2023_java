import java.util.Scanner;

public class practice28 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "번째 숫자를 입력하세요: ");
            numbers[i] = scanner.nextInt();
        }

        displayArray(numbers); // 배열 출력
        int max = findMax(numbers); // 배열에서 가장 큰 숫자 찾기
        System.out.println("가장 큰 숫자는 " + max + "입니다.");
    }

    // 배열 출력 메소드
    public static void displayArray(int[] iArray) {
    	int count=0;
    	
        System.out.println("입력된 숫자는 다음과 같습니다.");
        for (int i = 0; i < iArray.length; i++) {
            System.out.print(iArray[i] + " ");
            /*
            count++;
            if(count == 10) {
            	System.out.println();   
            	count=0;
            }
            */
            
            
            
            
            /*if ((i + 1) % 10 == 0) {
                System.out.println();*/
            }
        }
    

    // 배열에서 가장 큰 숫자 찾는 메소드
    public static int findMax(int[] iArray) {
        int max = iArray[0];
        for (int i = 1; i < iArray.length; i++) {
            if (iArray[i] > max) {
                max = iArray[i];
            }
        }
        return max;
    }
}

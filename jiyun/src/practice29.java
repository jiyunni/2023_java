import java.util.Random;


public class practice29 {

	public static void main(String[] args) {

        int[] data = new int[20];
        Random random = new Random();

        
        for (int i = 0; i < 20; i++) {
            data[i] = random.nextInt(100); // 0부터 99 사이의 난수 생성
        }

        System.out.println("생성된 난수는 다음과 같습니다.");
        displayArray(data); // 배열 출력

        int max = findMax(data); // 배열에서 가장 큰 숫자 찾기
        System.out.println("가장 큰 숫자는 " + max + "입니다.");
    }

    public static void displayArray(int[] iArray) {
        System.out.println("입력된 숫자는 다음과 같습니다.");
        for (int i = 0; i < iArray.length; i++) {
            System.out.print(iArray[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

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


import java.util.Random;

public class practice51 {
    public static void main(String[] args) {
        // 난수 발생기 생성
        Random random = new Random();

        // 1000부터 9999 사이의 4자리 난수를 10,000번 발생시켜서 출력
        int count1000 = 0;
        int count9999 = 0;

        for (int i = 0; i < 10000; i++) {
            int randomNumber = random.nextInt(9000) + 1000;

            // 1000과 9999의 발생 횟수 카운트
            if (randomNumber == 1000) {
                count1000++;
            } else if (randomNumber == 9999) {
                count9999++;
            }

            // 출력
            System.out.print(randomNumber + " ");

            // 가장 작은 숫자 1000 다음에 "*" 출력
            if (randomNumber == 1000) {
                System.out.print("* ");
            }

            // 가장 큰 숫자 9999 다음에 "+" 출력
            if (randomNumber == 9999) {
                System.out.print("+ ");
            }

            // 10개씩 출력하기 위한 줄 바꿈 처리
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        // 1000과 9999의 발생 횟수 출력
        System.out.println("\n# of 1000: " + count1000);
        System.out.println("# of 9999: " + count9999);
    }
}


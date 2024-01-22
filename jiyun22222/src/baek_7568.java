import java.util.Scanner;

public class baek_7568 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 사람의 수

        int[] weight = new int[n];
        int[] height = new int[n];
        int[] rank = new int[n];

        for (int i = 0; i < n; i++) {
            weight[i] = scanner.nextInt();
            height[i] = scanner.nextInt();
            rank[i] = 1; // 초기 등수는 1로 설정
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (weight[i] > weight[j] && height[i] > height[j]) {
                    // i번째 사람이 j번째 사람보다 덩치가 크면 등수 증가
                    rank[j]++;
                }
            }
        }

        // 등수 출력
        for (int i = 0; i < n; i++) {
            System.out.print(rank[i] + " ");
        }

        scanner.close();
    }
}


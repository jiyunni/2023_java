
public class practice15 {

	public static void main(String[] args) {
		
		//for
        int count = 0;
        for (int i = 1; i <= 100; i += 3) {
            System.out.print(i + " ");
            count++;

            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
        
        System.out.println("\n"); // 빈 줄 추가

        
        //while
        int j = 1;
        count = 0;
        while (j <= 100) {
            System.out.print(j + " ");
            count++;
            j += 3;

            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
    }


	}



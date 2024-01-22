import java.util.ArrayList;
import java.util.Scanner;

public class Maxtes_t {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numberList = new ArrayList<>();

        System.out.println("실수 5개를 입력하세요:");

        for (int i = 0; i < 5; i++) {
            System.out.print("실수 #" + (i + 1) + ": ");
            double input = scanner.nextDouble();
            numberList.add(input);
        }

        double sum = calculateSum(numberList);
        double max = findMax(numberList);

        System.out.println("입력한 실수 리스트:");
        System.out.println(numberList);
        System.out.println("모든 원소의 합: " + sum);
        System.out.println("최대값: " + max);

        
    }

    public static double calculateSum(ArrayList<Double> list) {
        double sum = 0;
        for (double number : list) {
            sum += number;
        }
        return sum;
    }

    public static double findMax(ArrayList<Double> list) {
        double max = Double.MIN_VALUE;
        for (double number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}

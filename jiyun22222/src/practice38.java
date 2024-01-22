import java.util.Scanner;

public class practice38 {
    public static void main(String[] args) {
        // Scanner를 이용하여 각 Person 객체의 정보 입력
        Scanner scanner = new Scanner(System.in);

        System.out.print("김상식 나이는? ");
        Person person1 = new Person("김상식", scanner.nextInt(), "서울");
        scanner.nextLine(); // 개행 문자 처리

        System.out.print("홍길동 나이는? ");
        Person person2 = new Person("홍길동", scanner.nextInt(), "경북");
        scanner.nextLine(); // 개행 문자 처리

        System.out.print("성춘향 나이는? ");
        Person person3 = new Person("성춘향", scanner.nextInt(), "전남");
        scanner.nextLine(); // 개행 문자 처리

        // 입력 받은 정보 출력
        printPersonInfo(person1);
        printPersonInfo(person2);
        printPersonInfo(person3);

        // 나이 비교 및 중간인 사람 출력
        findMiddleAgedPerson(person1, person2, person3);

        // 스캐너 닫기
        scanner.close();
    }

    // Person 정보 출력 메소드
    public static void printPersonInfo(Person person) {
        System.out.println(person.name + " : " + person.age + "세, " + person.address);
    }

    // 나이 비교 및 중간인 사람 출력 메소드
    public static void findMiddleAgedPerson(Person person1, Person person2, Person person3) {
        if ((person1.age > person2.age && person1.age < person3.age) || (person1.age < person2.age && person1.age > person3.age)) {
            System.out.println("나이가 중간인 사람은 " + person1.name + " 입니다.");
        } else if ((person2.age > person1.age && person2.age < person3.age) || (person2.age < person1.age && person2.age > person3.age)) {
            System.out.println("나이가 중간인 사람은 " + person2.name + " 입니다.");
        } else {
            System.out.println("나이가 중간인 사람은 " + person3.name + " 입니다.");
        }
    }
}


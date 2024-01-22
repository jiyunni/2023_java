interface MyInterface {
    void myMethod1();

    default void myMethod2() {
        System.out.println("MyMethod2");
    }
}

public class Deffault_metho implements MyInterface {
    public void myMethod1() {
        System.out.println("MyMethod1");
    }

    public static void main(String[] args) {
    	Deffault_metho obj = new Deffault_metho();
        obj.myMethod1();
        obj.myMethod2(); // 인터페이스의 디폴트 메소드 호출
    }
}


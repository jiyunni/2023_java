class Shape {
    public void draw() {
        System.out.println("shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        super.draw(); // 부모 클래스의 draw() 메소드 호출
        System.out.println("circle");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.draw();
    }
}


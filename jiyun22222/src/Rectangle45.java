public class Rectangle45 {
    private int width;
    private int height;

    // 가로 설정자
    public void setWidth(int width) {
        this.width = width;
    }

    // 가로 접근자
    public int getWidth() {
        return width;
    }

    // 세로 설정자
    public void setHeight(int height) {
        this.height = height;
    }

    // 세로 접근자
    public int getHeight() {
        return height;
    }

    // 넓이를 반환하는 메소드
    public int area() {
        return width * height;
    }

    // 둘레를 반환하는 메소드
    public int perimeter() {
        return 2 * (width + height);
    }
}

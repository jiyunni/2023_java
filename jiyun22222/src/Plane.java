

public class Plane {
    int id;
    String model;
    int capacity;

    // 디폴트 생성자
    public Plane() {
        this.id = 0;
        this.model = "모름";
        this.capacity = 0;
    }

    // 매개변수를 받는 생성자
    public Plane(int id, String model, int capacity) {
        this.id = id;
        this.model = model;
        this.capacity = capacity;
    }
}
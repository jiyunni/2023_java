
public class Plane54 {
    private int id;
    private String model;
    private int capacity;
    private static int planes = 0; // Static variable to count the number of planes

    // Default constructor
    public Plane54() {
        this.id = 0;
        this.model = "모름";
        this.capacity = 0;
        planes++; 
    }

    // Parameterized constructor
    public Plane54(int id, String model, int capacity) {
        this.id = id;
        this.model = model;
        this.capacity = capacity;
        planes++; // Increment the count of planes when a new instance is created
    }


    public static int getPlanes() {
        return planes;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // toString() method override
    @Override
    public String toString() {
        return "식별번호: " + id + "편\n모델: " + model + "\n승객수: " + capacity + "명";
    }
}

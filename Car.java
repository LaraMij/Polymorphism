//parent class
public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
 
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true; //set to default value.
        this.wheels = 4; // sett to default value.
    }
 
    public String startEngine() {
        return "Car -> startEngine()";
    }
    public String accelerate() {
        return "Car -> accelerate()";
    }
    public String brake() {
        return "Car -> brake()";
    }
     public int getCylinders() {
        return cylinders;
    }
    public String getName() {
        return name;
    }
}
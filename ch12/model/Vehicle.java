package gr.aueb.cf.ch12.model;

/**
 * it defines a simple {@link Vehicle} java bean with a public API.
 */
public class Vehicle {
    private int id;
    private String brand;
    private double velocity;
    private ColorType color;

    public Vehicle (){

    }

    public Vehicle(int id, String brand, double velocity, ColorType colorType) {
        this.id = id;
        this.brand = brand;
        this.velocity = velocity;
        this.color = colorType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public ColorType getColor() {
        return color;
    }

    public void setColor(ColorType color) {
        this.color = color;
    }

    //Public API
    public void startEngine(){
        System.out.println("Engine started");
    }

    public void stopEngine(){
        if (!isMoving()) {
            System.out.println("Engine stopped");
        } else {
            System.out.println("Warning. Vehicle is moving");
        }

    }

    private boolean isMoving(){
        return velocity != 0;
    }
}

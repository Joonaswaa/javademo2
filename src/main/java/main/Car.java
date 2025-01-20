package main;

public class Car {
    private String brand;
    private String model;
    private int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;

    }
    public void updateCar(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getSpeed() {
        return speed;
    }
}
    


    


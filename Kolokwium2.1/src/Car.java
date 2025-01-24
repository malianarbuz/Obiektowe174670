public class Car extends Vehicle {
    private int numberOfDoors;

    Car(String brand, String model,int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors=numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }


}

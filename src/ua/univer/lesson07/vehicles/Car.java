package ua.univer.lesson07.vehicles;

public class Car extends Vehicle {
    private Wheels wheels;
    public Car(int id, String name, double speed, int age) {
        super(id, name , speed, age);
        wheels = new Wheels(16,2000);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", speed=" + getSpeed() +
                ", age=" + getAge() +
                '}';
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }
}

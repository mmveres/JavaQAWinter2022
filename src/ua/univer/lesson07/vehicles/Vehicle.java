package ua.univer.lesson07.vehicles;

public abstract class Vehicle {
    private int id;
    private String name;
    private double speed;
    private int age;

    public Vehicle(int id, String name, double speed, int age) {
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", age=" + age +
                '}';
    }
}

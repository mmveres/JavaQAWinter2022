package ua.univer.lesson07.vehicles;

public class Plane extends Vehicle{
    private int count;
    private int height;

    public Plane(int id, String name, double speed, int age, int count, int height) {
        super(id, name, speed, age);
        this.count = count;
        this.height = height;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "count=" + count +
                ", height=" + height +
                "} " + super.toString();
    }
}

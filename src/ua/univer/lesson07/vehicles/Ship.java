package ua.univer.lesson07.vehicles;

public class Ship extends Vehicle{

    private String port;
    private int count;

    public Ship(int id, String name, double speed, int age, String port, int count) {
       super(id, name, speed, age);
        this.port = port;
        this.count = count;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Ship{" +
                super.toString() +
                ", port='" + port + '\'' +
                ", count=" + count +
                '}';
    }
}

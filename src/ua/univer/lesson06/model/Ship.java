package ua.univer.lesson06.model;



public class Ship extends Vehicle implements SwimAble, FlyAble {
    private int speed = 10;

    public int getSpeed() {
        return speed;
    }

    @Override
    public int getFly() {
        return 1;
    }
}

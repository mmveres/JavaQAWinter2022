package ua.univer.lesson06.model;



public class Boat extends Vehicle implements SwimAble {

    @Override
    public int getSpeed() {
        return 13;
    }
}

package ua.univer.lesson06;

import ua.univer.lesson06.model.*;

public class Program {
    public static void printSpeedSwim(SwimAble swimAble){
        System.out.println(swimAble.getSpeed());
    }

    public static void main(String[] args) {
        Ship ship1 = new Ship();
        ship1.setName("AAA");
        System.out.println(ship1.getName());
        Fish fish1 = new Fish();

        Dog dog1 = new Dog();
        printSpeedSwim(ship1);
        printSpeedSwim(fish1);
        printSpeedSwim(dog1);
        Boat boat1 = new Boat();
        printSpeedSwim(boat1);
    }
}

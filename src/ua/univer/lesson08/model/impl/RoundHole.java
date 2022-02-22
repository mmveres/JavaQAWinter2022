package ua.univer.lesson08.model.impl;

import ua.univer.lesson08.model.RoundAble;

public class RoundHole implements RoundAble {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "RoundHole{" +
                "radius=" + radius +
                '}';
    }
}
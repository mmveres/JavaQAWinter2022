package ua.univer.lesson08.model.impl;

import ua.univer.lesson08.model.RoundAble;

public class Round implements RoundAble {
    private double radius;

    public Round(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Round{" +
                "radius=" + radius +
                '}';
    }
}

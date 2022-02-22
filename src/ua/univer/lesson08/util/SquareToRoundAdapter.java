package ua.univer.lesson08.util;

import ua.univer.lesson08.model.RoundAble;
import ua.univer.lesson08.model.impl.Square;

public class SquareToRoundAdapter implements RoundAble {
    private Square square;

    public SquareToRoundAdapter(Square square) {
        this.square = square;
    }

    public double getRadius() {
        return  Math.sqrt(Math.pow((square.getWidth() / 2), 2) * 2);
    }

    @Override
    public String toString() {
        return "SquareToRoundAdapter{" + getRadius()+
                '}';
    }
}

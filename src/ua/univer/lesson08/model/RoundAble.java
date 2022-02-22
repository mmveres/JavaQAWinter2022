package ua.univer.lesson08.model;

public interface RoundAble extends Comparable<RoundAble> {
    double getRadius();

    @Override
    default int compareTo(RoundAble o) {
        return (int) (this.getRadius()-o.getRadius());
    }


}

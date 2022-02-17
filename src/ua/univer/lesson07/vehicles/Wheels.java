package ua.univer.lesson07.vehicles;

public class Wheels {
    private int diametr;
    private int price;

    public Wheels(int diametr, int price) {
        this.diametr = diametr;
        this.price = price;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "diametr=" + diametr +
                ", price=" + price +
                '}';
    }
}

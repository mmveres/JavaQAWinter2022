package ua.univer.lesson07;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.setPrice(price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price*Currency.getUsd();
    }
    public double getPriceRitail() {
        return price*Currency.getUsd()*(1.20+0.10+0.20+0.10);
    }
    public void setPrice(double price) {
        this.price = price/Currency.getUsd();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + getPriceRitail() +
                '}';
    }
}

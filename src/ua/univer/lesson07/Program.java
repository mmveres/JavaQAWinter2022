package ua.univer.lesson07;

public class Program {
    public static void main(String[] args) {
        Currency.setUsd(28.00);
        Product p1 = new Product(1,"Apple", 20.0);
        Product p2 = new Product(2,"Potato", 10.5);
        Currency.setUsd(29.00);
        System.out.println(p1);
        System.out.println(p2);
    }
}

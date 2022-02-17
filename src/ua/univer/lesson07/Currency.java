package ua.univer.lesson07;

public class Currency {
    private static double usd;
    private static double eur;
    static {
        usd = 28.00;
        eur = 30.00;
    }

    public static double  getUsd() {
        return usd;
    }

    public static void setUsd(double usd) {
       Currency.usd = usd;
    }

}

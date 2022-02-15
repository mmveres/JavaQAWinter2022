package ua.univer.lesson02;

public class Program {
    public static void main(String[] args) {
        int x = 1;
        long l = 3_000_000_000L;
        double y = 3.14;
        float f1 = 10.0001F;
        float f2 = 10.0002F;
        float eps = 0.01F;
        System.out.println(Math.abs(f1-f2)<eps);

        int x1 = 1;
        int x2 = 2;
        double res = (double)x1/x2;
        System.out.println(res);
        System.out.println("result= "+(x1+x2));

        Integer ii;
        ii = 1;
        int i = ii;
        i++;

        if (x1<0 && x2>0)
            System.out.println("true");
        else
            System.out.println("false");

        System.out.println(!(x1<0));

        System.out.println(5&6);
        if(x2%2==0)
            System.out.println("even");
        else
            System.out.println("odd");

        if((x1&1)!=1)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}

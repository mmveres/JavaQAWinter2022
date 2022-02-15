package ua.univer.lesson02;

import java.util.Scanner;

public class ProgramCycle {

    public static void print100(){
        {
            int i = 0;
            while (i < 100) {
                System.out.println(i);
                i++;  //i=i+1;
            }
        }
    }
    public static void main(String[] args) {
        print100();

        {
            int i = 200;
            while (i >= 100) {
                System.out.println(i);
                i--;  //i=i+1;
            }
        }

        for(int i = 0; i < 100; i++){
            System.out.println(i);
        }
        String answer = "Y";
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Buy elephant 100000$");
           answer = sc.next();
        }while(!answer.equals("Y"));

        for (int i = 0; i < 100; i++) {
            if (i%2==0) continue;
            System.out.println(i);
            if(i == 11) break;
        }
    }
}

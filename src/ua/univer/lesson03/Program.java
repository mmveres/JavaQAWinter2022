package ua.univer.lesson03;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        //    int[] arr = createArr();
        //    printArr1(arr);
        //    printArr2(arr);
        //    printArr3(arr);
        // printArr3(createArrSqrValue(10));
     //   int[] arr = createArrFromConsole();
    //    printArr3(arr);
        int [] arr1 = new int[5];
        Arrays.fill(arr1, 55);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 ={11,2,3,54,6,46,4,4,88};
     //   Arrays.sort(arr2);

        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length-1-i; j++) {
                if(arr2[j]<arr2[j+1]){
                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(count);
    }

    private static int[] createArrFromConsole() {
        Scanner sc = new Scanner(System.in);
        int count = -1;
        while (count < 0) {
            System.out.println("enter positive count array element");
            if (sc.hasNextInt()) {
                count = sc.nextInt();
            } else {
                System.err.println("Error not int");
                sc.nextLine();
            }
        }
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static void printArr3(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }

    public static void printArr1(int[] arr) {
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }

    public static int[] createArr() {
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 11;
        arr[2] = 12;
        arr[3] = 13;
        return arr;
    }

    public static int[] createArrSqrValue(int n) {
        if (n < 0) throw new IllegalArgumentException("n not positive");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }
        return arr;
    }

    private static void printArr2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

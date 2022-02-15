package ua.univer.lesson04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int a = 11;
        int b = 12;
        int c = 13;
        swap(a,b); // not work
        swap(a,c); // not work
        swap(c,b); // not work
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        int [] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        arr = swapArr(arr);
        System.out.println("arr[0] = "+ arr[0]);
        System.out.println("arr[1] = "+ arr[1]);

    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static int[] swapArr(int[] arr){
//        int[] arr_t = new int[arr.length];
//        System.arraycopy(arr,0,arr_t,0,arr.length);
//        arr = arr_t;
        arr = Arrays.copyOf(arr, arr.length*2);
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        return arr;
    }
}

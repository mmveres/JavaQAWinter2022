package ua.univer.lesson05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProgramStr {
    public static void main(String[] args) throws IOException {
        //     testString();
        //     Scanner sc = new Scanner(System.in);
   //     readFromTxtFile("matrix.txt", 2, " ");
        System.out.println(readStrFromTxtFile("matrix.txt"));

//        int [][] matrix = {
//                {1,2,3,34,4,5,6,67},
//                {11,42,3,34,4,5,6,67},
//                {31,52,3,34,4,5,6,67},
//        };
//        writeMatrixToFile(matrix,"m.csv");
    }

    private static void writeMatrixToFile(int[][] matrix, String filename) throws IOException {
        FileWriter fw = new FileWriter(filename);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                fw.write(String.valueOf(matrix[i][j])+";");
            }
           fw.write("\r\n");
        }
        fw.close();
    }

    private static String readStrFromTxtFile(String filename ) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        StringBuilder sb = new StringBuilder(1);
        while (sc.hasNext()) {
            sb.append(sc.next());
            sb.append(",");
            System.out.println(sb.length()+"/"+sb.capacity());
        }
        sc.close();
        return sb.toString();
    }
    private static void readFromTxtFile(String filename, int findCount, String separator ) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        int count = 0;
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if(count == findCount || findCount == -1)
                printWordOnLine(str, separator);
            count++;
        }
        sc.close();
    }

    private static void printWordOnLine(String str, String separator) {
        String[] words = str.split(separator);
        for (String w : words) {
            System.out.print(w+"\t");
        }
        System.out.println();
    }

    private static void testString() {
        String str = "mama mila ramu mama ramu mila mama mila mama";
        String word = "mama";
        int index = str.indexOf(word);
        int last = str.lastIndexOf(word);
        while (index < last) {
            System.out.println(index);
            index = str.indexOf(word, index + 1);
        }
        System.out.println(last);
        System.out.println(word.toUpperCase());
        System.out.println(str.replace("mama", "tato"));
        printWordOnLine(str," ");
    }
}

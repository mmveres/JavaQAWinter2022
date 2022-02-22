package ua.univer.lesson08.controller;

import java.io.FileWriter;
import java.io.IOException;

public class LogController {
    public static void logConsole(String info){
        System.out.println(info);
    }
    public static void logTxtFile(String info){
        try {
            FileWriter fw = new FileWriter("infoLog.txt");
            fw.write(info);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

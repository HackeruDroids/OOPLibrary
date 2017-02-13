package edu.tomer;

import java.util.Scanner;

public class IO {
    public static Scanner scanner = new Scanner(System.in);

    private IO(){}

    public static int getInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }

    public static String getString(String message) {
        System.out.println(message);
        return scanner.next();
    }

    public static float getFloat(String message) {
        System.out.println(message);
        return scanner.nextFloat();
    }
}
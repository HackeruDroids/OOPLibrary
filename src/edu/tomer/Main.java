package edu.tomer;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        LocalDateTime dateTime = IO.getDateTime("Enter Hire Date:");

        System.out.println(dateTime);

    }
}

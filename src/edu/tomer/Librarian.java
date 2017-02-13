package edu.tomer;

import java.time.LocalDateTime;

/**
 * Created by hackeru on 13/02/2017.
 */
public class Librarian extends Person{
    private LocalDateTime hireDate;

    //Constructor
    public Librarian() {
        super();//call the Base Class Constructor
        this.hireDate = LocalDateTime.now();
    }

    public Librarian(String firstName, String lastName, String socialID, LocalDateTime hireDate) {
        super(firstName, lastName, socialID);
        this.hireDate = hireDate;
    }
}

package edu.tomer;

public class Main {

    public static void main(String[] args) {
        LibraryMenu menu = new LibraryMenu();
        menu.start();

        Book b = new Book("Catcher In The Rye", "Salinger", 19.99f);
        float priceAfterVAT = b.priceAfterVAT();
        System.out.println(priceAfterVAT);
    }
}

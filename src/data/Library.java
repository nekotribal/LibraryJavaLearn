package data;

import display.DisplayBook;
import utils.DataReader;

public class Library {
    public static void main(String[] args) {
        final String appName = "Library Test Project v0.1";

        Book[] books = new Book[1000];

        books[0] = new Book("W pustyni i w puszczy"
                , "Henryk Sienkiewicz"
                , 2010,
                296, "Greg",
                "9788373271890");
        books[1] = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009,
                352, "Helion", "9788324620845");
        books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
                "Bert Bates, Katherine Sierra", 2008, 851, "McGraw-Hill Osborne Media",
                "9780071591065");

        DisplayBook display = new DisplayBook();
        display.displayList();
        display.displayBook(books[0]);
        display.displayBook(books[1]);
        display.displayBook(books[2]);

        DataReader dataReader = new DataReader();
        System.out.println("Enter new book: ");
        books[3] = dataReader.readAndCreateBook();
        dataReader.scannerClose();

        display.displayBook(books[3]);

        display.displayTotalCount(books.length);


    }
}



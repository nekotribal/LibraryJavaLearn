package utils;

import data.Book;

import java.util.Scanner;

public class DataReader {
    private Scanner sc;

    public DataReader() {
        sc = new Scanner(System.in);
    }

    public void scannerClose() {
        sc.close();
    }

    public Book readAndCreateBook() {
        System.out.println("Title: ");
        String title = sc.nextLine();
        System.out.println("Author: ");
        String author = sc.nextLine();
        System.out.println("Publisher: ");
        String publisher = sc.nextLine();
        System.out.println("ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Year Released: ");
        int releaseDate = sc.nextInt();
        sc.nextLine();
        System.out.println("Pages: ");
        int pages = sc.nextInt();
        sc.nextLine();

        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }
}

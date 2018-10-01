package org.nktrb.utils;

import org.nktrb.data.Book;

import java.util.Scanner;

public class DataReader {
    private static Scanner scanner = new Scanner(System.in);

    public DataReader() {
    }

    public Book readAndCreateBook() {
        System.out.println("Title: ");
        String title = scanner.nextLine();
        System.out.println("Author: ");
        String author = scanner.nextLine();
        System.out.println("Publisher: ");
        String publisher = scanner.nextLine();
        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.println("Year Released: ");
        int releaseDate = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Pages: ");
        int pages = scanner.nextInt();
        scanner.nextLine();

        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }
}
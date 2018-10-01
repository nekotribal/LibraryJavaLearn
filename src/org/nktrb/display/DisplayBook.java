package org.nktrb.display;

import org.nktrb.data.Book;

public class DisplayBook {

    public void printBooks(Book[] books) {
        int num = books.length;
        if (num == 0) {
            System.out.println("No books");
        }
        System.out.println("Books available:");
        for (int i = 0; i < num; i++) {
            if (books[i] != null) {
                displayBook(books[i]);
            }
        }
    }

    public void printBookNumber(int number) {
        System.out.println("There are " + number + " books in library");
    }

    public void displayBook(Book displayBook) {
        String info = displayBook.getTitle() + "; " + displayBook.getAuthor() + "; "
                + displayBook.getReleaseDate() + "; " + displayBook.getPages() + "; "
                + displayBook.getPublisher() + "; " + displayBook.getIsbn();
        System.out.println(info);
    }

    public void displayBooksMaxCount(int booksAmount) {
        System.out.println("System is able to store " + booksAmount + " books");
    }
}

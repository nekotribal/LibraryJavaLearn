package org.nktrb.data;

public class Library {

    public final int maxBooks = 1000;
    private Book[] books;
    private int booksNumber = 0;

    public Library() {
        books = new Book[maxBooks];
    }

    public int getBooksNumber() {
        return booksNumber;
    }

    public Book[] getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (booksNumber < maxBooks) {
            books[booksNumber] = book;
            booksNumber++;
            System.out.println("Book added!");
        } else {
            System.out.println("Maximum books achieved");
        }
    }
}
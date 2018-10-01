package org.nktrb.app;

import org.nktrb.data.Book;
import org.nktrb.data.Library;
import org.nktrb.display.DisplayBook;
import org.nktrb.utils.DataReader;

import java.util.Scanner;

public class LibraryApp {

    static Library library = new Library();
    static DisplayBook display = new DisplayBook();
    static Book[] books = library.getBooks();
    static Scanner scanner = new Scanner(System.in);
    static DataReader dataReader = new DataReader();
    final String appName = "Library Test Project v0.3";

    public static void main(String[] args) {

        Book test = new Book("W pustyni i w puszczy"
                , "Henryk Sienkiewicz"
                , 2010,
                296, "Greg",
                "9788373271890");
        library.addBook(test);

        printActions();
        mainMenu();
    }

    public static void printActions() {
        System.out.println("1 add 2 display all 3 display [n] 4 display count 5 display max count 9 print actions");
    }

    public static void mainMenu() {
        System.out.println("Select action: ");
        boolean quit = false;
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    Book newBook = dataReader.readAndCreateBook();
                    library.addBook(newBook);
                    break;
                case 2:
                    display.printBooks(books);
                    break;
                case 3:
                    System.out.println("Book id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    if (books[id] != null) {
                        display.displayBook(books[id]);
                    } else {
                        System.out.println("No such book!");
                    }
                    break;
                case 4:
                    display.printBookNumber(library.getBooksNumber());
                    break;
                case 5:
                    display.displayBooksMaxCount(library.maxBooks);
                    break;
                case 9:
                    printActions();
            }
        }
    }
}
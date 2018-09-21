package display;

public class DisplayBook {
    public void displayList() {

        System.out.println("Books available:");
    }

    public void displayBook(data.Book displayBook) {
//        System.out.println(displayBook.title);
//        System.out.println(displayBook.author);
//        System.out.println(displayBook.releaseDate);
//        System.out.println(displayBook.pages);
//        System.out.println(displayBook.publisher);
//        System.out.println(displayBook.isbn);


        String info = displayBook.getTitle() + "; " + displayBook.getAuthor() + "; "
                + displayBook.getReleaseDate() + "; " + displayBook.getPages() + "; "
                + displayBook.getPublisher() + "; " + displayBook.getIsbn();
        System.out.println(info);
    }

    public void displayTotalCount(int booksAmount) {
        System.out.println("System is able to store " + booksAmount + " books");
    }
}

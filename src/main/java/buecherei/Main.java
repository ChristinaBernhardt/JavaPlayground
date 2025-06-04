package buecherei;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> booksFromFactory = BookFactory.createBooks();
        Library library = new Library();
        library.addBooks(booksFromFactory);




        library.lentBook();
    }
}
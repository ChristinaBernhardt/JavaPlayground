package buecherei;

import java.util.ArrayList;

public class BookFactory {
    public static ArrayList<Book> createBooks() {
        ArrayList<Book> libraryBooks = new ArrayList<>();
        libraryBooks.add(new Book("Der Meister und Margarita", "Michail Bulgakow", 1967, "9783453214234"));
        libraryBooks.add(new Book("Das Wunderkind", "Anna-Lena", 2021, "8783453214234"));
        libraryBooks.add(new Book("Der Meister", "Michael", 1978, "4283453214234"));
        System.out.println("Bookfactory: " + libraryBooks);
        return libraryBooks;

    }

}

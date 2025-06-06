package buecherei;

import java.util.ArrayList;

public class BookFactory {
    public static ArrayList<Book> createBooks() {
        ArrayList<Book> libraryBooks = new ArrayList<>();
        Book book1 = new Book("Der Meister und Margarita", "Michail Bulgakow", 1967, "9783453214234");
        libraryBooks.add(book1);
        Book book2 = new Book( "Das Wunderkind", "Anna-Lena", 2021, "8783453214234");
           libraryBooks.add(book2);
        libraryBooks.add(new Book("Der Meister", "Michael", 1978, "4283453214234"));
        libraryBooks.add(new Book("Der Pferdeflüsterer", "Monty Roberts", 1978, "4283453214235"));
        return libraryBooks;
    }

}

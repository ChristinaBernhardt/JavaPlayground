//Spiegelt Büchereibestand wieder inkl. Prüfung ob redundant und ob verliehen

package buecherei;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBooks(ArrayList<Book> books) {
        for (Book book : books) {
            boolean sollBuchHinzugefügtwerden = verifyIsbn(book.getIsbn());
            if (sollBuchHinzugefügtwerden) {
                books.add(book);
            } else {
                System.out.println("ISBN ist bereits vorhanden!");
            }
        }
    }

    private boolean verifyIsbn(String isbnNeu) {
        for (Book bookToVerify : books) {
            if (bookToVerify.getIsbn().equals(isbnNeu)) {
                return false;
            }
        }
        return true;
    }

    public void printAllBooks() {
        System.out.println("Alle Bücher in der Bibliothek:");
        for (Book book : books) {
            book.printInfo();
        }
    }

    public void lentBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die ISBN des Buches ein, das Sie ausleihen möchten:");
        String ISBN = scanner.nextLine();

        boolean found = false;
        for (Book book : books) {
            if (book.getIsbn().equals(ISBN)) {
                found = true;
                System.out.println("Sie haben das Buch " + book.getIsbn() + " ausgeliehen.");
                break;
            }
        }

        if (!found) {
            System.out.println("Buch mit ISBN " + ISBN + " nicht gefunden.");
        }
    }

    ;
}



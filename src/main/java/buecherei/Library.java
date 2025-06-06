//Spiegelt Büchereibestand wieder inkl. Prüfung ob redundant und ob verliehen

package buecherei;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> libraryBooks = new ArrayList<>();
    private ArrayList<Book> lentBooks = new ArrayList<>();

    public void addBooks(ArrayList<Book> newBooks) {
        for (Book book : newBooks) {
            boolean sollBuchHinzugefügtwerden = verifyIsbn(book.getIsbn());
            if (sollBuchHinzugefügtwerden) {
                libraryBooks.add(book);
            } else {
                System.out.println("ISBN ist bereits vorhanden!");
            }
        }
    }

    private boolean verifyIsbn(String isbnNeu) {
        for (Book bookToVerify : libraryBooks) {
            if (bookToVerify.getIsbn().equals(isbnNeu)) {
                return false;
            }
        }
        return true;
    }

    public void printAllBooks() {
        System.out.println("Alle Bücher in der Bibliothek:");
        for (Book book : libraryBooks) {
            book.printInfo();
        }
    }
public void actionBook(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Treffen Sie eine Auswahl:");
    System.out.println("1 = Buch ausleihen");
    System.out.println("2 = Buch hinzufügen");
    System.out.println("3 = Buch löschen");
    System.out.print("Ihre Auswahl: ");

    int auswahl = scanner.nextInt();

    switch (auswahl) {
        case 1:
            System.out.println("Buch wird ausgeliehen...");
            lentBook();
            break;
        case 2:
            System.out.println("Buch wird hinzugefügt...");
            // Methode zum Hinzufügen aufrufen
            break;
        case 3:
            System.out.println("Buch wird gelöscht...");
            // Methode zum Löschen aufrufen
            break;
        default:
            System.out.println("Ungültige Auswahl.");
    }

    scanner.close();

}

    public void lentBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die ISBN des Buches ein, das Sie ausleihen möchten:");
        String ISBN = scanner.nextLine();

        Iterator<Book> bookIterator = libraryBooks.iterator();
        boolean found = false;

        while (bookIterator.hasNext()) {
            Book book = bookIterator.next();
            if (book.getIsbn().equals(ISBN)) {
                found = true;
                System.out.println("Sie haben das Buch mit der ISBN " + book.getIsbn() + " und dem Titel '" + book.getTitle() + "' ausgeliehen.");
                bookIterator.remove();
                lentBooks.add(book);
                break;
            }
        }

        if (!found) {
            System.out.println("Buch mit ISBN " + ISBN + " nicht gefunden.");
        }
    }

    public void printAvailableBooks() {
        System.out.println(" Verfügbare Bücher:");
        for (Book book : libraryBooks) {
            System.out.println(book);
        }
    }

    public void printLentBooks() {
        System.out.println(" Ausgeliehene Bücher:");
        for (Book book : lentBooks) {
            System.out.println(book);
        }
    }}




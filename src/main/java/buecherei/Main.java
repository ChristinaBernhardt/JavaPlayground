package buecherei; //Package, nutzbar für kleine Testprojekte, sonst neues Projekt anlegen

import java.util.ArrayList; //Importiert JAVA Standardklassen und macht sie somit nutzbar. Geschieht automatisch.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> booksFromFactory = BookFactory.createBooks(); //Rückgabewert aus createBooks wird in neue ArrayList booksFromFactory abgelegt, namenlose aus createBooks wird gelöscht
        Library library = new Library(); //Eine neue Instanz vom Typ Library wird erzeugt
        library.addBooks(booksFromFactory); //es wird die Methode addBooks aus der library aufgerufen, dieser Methode wird booksfromFactory(nur die Referenzen) mitgegeben
        library.printAllBooks();// es wird die Methode printAllBooks aus der library aufgerufen - ohne Mitgabewert
        library.actionBook();// es wird die Methode actionBook aus der library aufgerufen - ohne Mitgabewert
        library.printAvailableBooks(); //Array verfügbare Bücher wird ausgegeben
        library.printLentBooks(); //Array geliehene Bücher wird ausgegeben
        library.printDeletedBooks();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            library.printAllBooks();
            library.actionBook();

            System.out.print("\nMöchten Sie fortfahren? (j = ja, n = nein): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("n")) {
                running = false;
            }
        }

        System.out.println("Programm beendet.");
        scanner.close();

    }
}
package buecherei;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;

    public Book(String title5, String author, int yearPublished, String isbn) {
        this.title = title5;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
    }

    public void printInfo() {
        System.out.println("Titel: " + title + ", Autor: " + author + ", Jahr der Veröffentlichung: " + yearPublished + ", ISBN: " + isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public String toString(){
        return ("Titel: " + title + ", Autor: " + author + ", Jahr der Veröffentlichung: " + yearPublished + ", ISBN: " + isbn);
    }
}

package models;

public class Ebook extends Book {
    double filesize;

    public Ebook(String bookname, String author, String publisher, String ISBN, int publishedYear, Genre genre, double filesize) {
        super(bookname, author, publisher, ISBN, publishedYear, genre);
        this.filesize = filesize;
    }

    public double getFilesize() {
        return filesize;
    }

    public void setFilesize(double filesize) {
        this.filesize = filesize;
    }
}

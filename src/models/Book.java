package models;

public class Book {
    String Bookname;
    String Author;
    String Publisher;
    String ISBN;
    int PublishedYear;
    Genre genre;

    public Book(String bookname, String author, String publisher, String ISBN, int publishedYear, Genre genre) {
        Bookname = bookname;
        Author = author;
        Publisher = publisher;
        this.ISBN = ISBN;
        PublishedYear = publishedYear;
        this.genre = genre;
    }

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String bookname) {
        Bookname = bookname;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublishedYear() {
        return PublishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        PublishedYear = publishedYear;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}

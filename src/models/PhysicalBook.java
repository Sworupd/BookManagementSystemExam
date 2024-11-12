package models;

public class PhysicalBook extends Book{
    String quality;

    public PhysicalBook(String bookname, String author, String publisher, String ISBN, int publishedYear, Genre genre, String quality) {
        super(bookname, author, publisher, ISBN, publishedYear, genre);
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}

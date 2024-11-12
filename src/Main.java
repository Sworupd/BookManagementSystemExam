import models.Book;
import models.BookOrder;
import models.PhysicalBook;
import models.Ebook;
import models.Genre;
public class Main {
    public static void main(String[] args) {
        Genre g1 = new Genre("Fiction", "Best Fiction");
        Genre g2 = new Genre("Fiction", "Good Fiction");
        System.out.println(g1.getGenreName());

        g1.setFiction("This is my fiction");
        System.out.println(g1.getFiction());

        Book b1 = new Book("Mangena","Ram","Sahitya","Serial",2012,g1);

        BookOrder order1 = new BookOrder(1,2065);

        Ebook book1 = new Ebook("Mangena","Ram","Sahitya","Serial",2065,g1,21.65);

        PhysicalBook book2 = new PhysicalBook("Mangena","Ram","Sahitya","Serial",2012,g1,"Poor");

        System.out.println("Book 1"+ b1.getPublishedYear());
        System.out.println("Book 2"+ book1.getBookname());

    }
}
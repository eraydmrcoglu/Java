import java.util.*;

public class BookList {
    public static void main(String[] args) {
        Map<String, String> bookNameAuthor = new HashMap<>();
        List<Book> bookPage = new ArrayList<>();

        List<Book> books = new ArrayList<>(Arrays.asList(new Book("River Queen", "Stacee Gofforth", 245),
                new Book("Magic Flute", "Dale Crock", 500),
                new Book("Night Train To Lisbon", "Lenette Oke", 487)));
        books.addAll(Arrays.asList(new Book("Jungle", "Keri Dring", 342),
                new Book("Vatel", "Garrott Fitzhenry", 60),
                new Book("Madeinusa", "Rita Hunter ", 400),
                new Book("Communion", "Farah Everal", 614),
                new Book("Laws of Gravity", "Rober Jordan , Brandon Sanderson", 505),
                new Book("Lust for Life", "Eldin Oscroft", 75),
                new Book("Dirty Wars", "Dotti Bedder", 452)));

        books.forEach(book -> bookNameAuthor.put(book.getBookName(), book.getAuthor()));
        System.out.println("  ***BOOK & AUTHOR***");
        for (String key : bookNameAuthor.keySet()) {
            System.out.println(key + " | " + bookNameAuthor.get(key));

        }
        System.out.println();
        System.out.println("*************************************");
        System.out.println(" ***BOOKS OF MORE THAN 100 PAGES*** ");
        System.out.println();
        books.stream().filter(book -> book.getBookPage() > 100).forEach(bookPage::add);
        for (Book b : bookPage) {
            System.out.println(b.getBookName() + " -> " + b.getBookPage());
        }
    }
}
record Book(String bookName, String author, int bookPage) {
    public String getBookName() {
        return bookName;
    }
    public String getAuthor() {
        return author;
    }
    public int getBookPage() {
        return bookPage;
    }
}
package Assignment2;
import java.util.ArrayList;

public class Library {
    // ── Fields ────────────────────────────────────────────────────────────────
    private String libraryName;
    private ArrayList<Book> books;

    // ── Constructor ───────────────────────────────────────────────────────────
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // ── Methods ───────────────────────────────────────────────────────────────

    /**
     * Adds a Book object to the library's collection.
     */
    public void addBook(Book book) {
        books.add(book);
        System.out.println("✔  Added: \"" + book.getTitle() + "\" (" + book.getYear() + ")");
    }

    /**
     * Displays all books using forEach — no explicit loop keyword.
     */
    public void displayAllBooks() {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║   " + libraryName + " — Book Catalogue");
        System.out.println("║   Total books: " + books.size());
        System.out.println("╚══════════════════════════════════════╝\n");

        // System.out::println It tells Java: "For every book in the list,
        // take that book object and pass it directly into the System.out.println method."
        // .forEach(): It tells the list: "Go through every item you have, one by one."
        books.forEach(System.out::println);
    }

    /**
     * Returns the number of books currently in the library.
     */
    public int getTotalBooks() {
        return books.size();
    }
}

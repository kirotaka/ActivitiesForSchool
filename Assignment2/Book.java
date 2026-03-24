package Assignment2;

public class Book {

    // ── Fields ────────────────────────────────────────────────────────────────
    private String title;
    private String author;
    private int    year;

    // ── Constructor ───────────────────────────────────────────────────────────
    public Book(String title, String author, int year) {
        this.title  = title;
        this.author = author;
        this.year   = year;
    }

    // ── Getters ───────────────────────────────────────────────────────────────
    public String getTitle()  { return title;  }
    public String getAuthor() { return author; }
    public int    getYear()   { return year;   }

    // ── toString ──────────────────────────────────────────────────────────────
    @Override
    public String toString() {
        return String.format(
                "┌─────────────────────────────────────┐%n" +
                        "│  Title  : %-26s │%n" +
                        "│  Author : %-26s │%n" +
                        "│  Year   : %-26d │%n" +
                        "└─────────────────────────────────────┘",
                title, author, year
        );
    }
}

package Assignment2;

public class Main {
    public static void main(String[] args) {

        // 1. Create a Library object
        Library library = new Library("PUP Public Library");

        // 2. Create individual Book objects
        Book book1 = new Book("Gapo",                      "Lualhati Bautista", 1988);
        Book book2 = new Book("El Filibusterismo",         "Jose Rizal",        1891);
        Book book3 = new Book("Dekada '70",                "Lualhati Bautista", 1983);
        Book book4 = new Book("Florante at Laura",         "Francisco Balagtas",1838);
        Book book5 = new Book("Banaag at Sikat",           "Lope K. Santos",    1906);

        // 3. Add books to the library
        System.out.println("\n── Adding Books ────────────────────────");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        // 4. Display all books
        library.displayAllBooks();

        System.out.println("\n📚 Total books in library: " + library.getTotalBooks());
    }
}


public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem(5);

        Book book1 = new Book("B001", "Harry Potter", "J.K. Rowling");
        Book book2 = new Book("B002", "The Hobbit", "J.R.R. Tolkien");
        Book book3 = new Book("B003", "1984", "George Orwell");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Linear Search for 'The Hobbit':");
        Book foundBook = library.linearSearchByTitle("The Hobbit");
        System.out.println(foundBook != null ? foundBook : "Book not found!");

        System.out.println("\nBinary Search for '1984':");
        foundBook = library.binarySearchByTitle("1984");
        System.out.println(foundBook != null ? foundBook : "Book not found!");
    }
}

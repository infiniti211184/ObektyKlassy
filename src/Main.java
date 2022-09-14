import java.awt.print.Book;

public class Main {
    int Book;
    static Book[] books = new Book[3];
    int next = 0;

    public static void main(String[] args) {
        var library = new Library ( librarySize: 5);
        library.add(new Book ( name: "name", author: null, publicationYear: 123));
        library.add(new Book ( name: "name", author: null, publicationYear: 123));
        library.add(new Book ( name: "name", author: null, publicationYear: 123));
        library.add(new Book ( name: "name", author: null, publicationYear: 123));
        library.add(new Book ( name: "name", author: null, publicationYear: 123));
        library.add(new Book ( name: "name", author: null, publicationYear: 123));

        addBook(new Book( name: "name1", author: null, publicationYear: 123));
        addBook(new Book( name: "name1", author: null, publicationYear: 123));
        addBook(new Book( name: "name1", author: null, publicationYear: 123));
    }
    public static void addBook(java.awt.print.Book) {
        books[next] = book;
        next = next + 1;
    }

    
}
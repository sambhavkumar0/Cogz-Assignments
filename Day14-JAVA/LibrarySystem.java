// Book class
class Book {
    String title, author;
    int bookId;
    boolean isAvailable = true;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void displayInfo() {
        System.out.println(
                "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}

class User {
    int userId;
    String name;

    User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    void borrowBook(Book book) {
        if (book.isAvailable) {
            System.out.println(name + " borrowed " + book.title);
            book.isAvailable = false;
        } else {
            System.out.println(book.title + " is currently not available.");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Book b1 = new Book(1, "Java", "James Gosling");
        Book b2 = new Book(2, "Python", "Guido van Rossum");

        User u1 = new User(101, "Sambhav");

        b1.displayInfo();
        b2.displayInfo();

        u1.borrowBook(b1);
        u1.borrowBook(b1);

        b1.displayInfo();
    }
}

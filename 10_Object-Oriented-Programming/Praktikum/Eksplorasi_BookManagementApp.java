import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class BookManagementApp {
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("Welcome to book management app");
            System.out.println("Please choose your menu:");
            System.out.println("1. Create a new book");
            System.out.println("2. Get all books");
            System.out.println("3. Get book by ID");
            System.out.println("4. Update book");
            System.out.println("5. Delete book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice:\n");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createNewBook();
                    break;
                case 2:
                    getAllBooks();
                    break;
                case 3:
                    getBookById();
                    break;
                case 4:
                    updateBook();
                    break;
                case 5:
                    deleteBook();
                    break;
                case 6:
                    System.out.println("Bye....");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 6);
    }

    private static void createNewBook() {
        scanner.nextLine();
        System.out.print("Enter the title:\n");
        String title = scanner.nextLine();
        System.out.print("Enter the author:\n");
        String author = scanner.nextLine();
        System.out.print("Enter the category:\n");
        String category = scanner.nextLine();

        Book newBook = new Book(title, author, category);
        books.add(newBook);

        System.out.println("Book created!");
        System.out.println("===");
        System.out.println("ID: " + newBook.getId());
        System.out.println("Title: " + newBook.getTitle());
        System.out.println("Author: " + newBook.getAuthor());
        System.out.println("Category: " + newBook.getCategory());
        System.out.println("===");
    }


    private static void getAllBooks() {
        System.out.println("\nList of all books:");
        for (Book book : books) {
            System.out.println("ID: " + book.getId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Category: " + book.getCategory());
            System.out.println();
        }
    }

    private static void getBookById() {
        scanner.nextLine();
        System.out.print("Enter book ID: ");
        String idString = scanner.nextLine();
        UUID id;

        try {
            id = UUID.fromString(idString);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid ID format.");
            return;
        }

        for (Book book : books) {
            if (book.getId().equals(id)) {
                System.out.println("Book found:");
                System.out.println("===");
                System.out.println("ID: " + book.getId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Category: " + book.getCategory());
                return;
            }
        }

        System.out.println("Book not found with ID: " + id);
    }

    private static void updateBook() {
        scanner.nextLine();
        System.out.print("Enter the ID of the book to update:\n ");
        String idString = scanner.nextLine();
        UUID id;

        try {
            id = UUID.fromString(idString);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid ID format.");
            return;
        }

        for (Book book : books) {
            if (book.getId().equals(id)) {
                System.out.print("Enter the new title:\n ");
                String newTitle = scanner.nextLine();
                System.out.print("Enter the new author:\n ");
                String newAuthor = scanner.nextLine();
                System.out.print("Enter the new category:\n ");
                String newCategory = scanner.nextLine();

                book.title = newTitle;
                book.author = newAuthor;
                book.category = newCategory;

                System.out.println("Book updated!");
                System.out.println("ID: " + book.getId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Category: " + book.getCategory());
                return;
            }
        }

        System.out.println("Book not found with ID: " + id);
    }


    private static void deleteBook() {
        scanner.nextLine();
        System.out.print("Enter book ID: ");
        String idString = scanner.nextLine();
        UUID id;

        try {
            id = UUID.fromString(idString);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid ID format.");
            return;
        }

        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                System.out.println("Book deleted!");
                return;
            }
        }

        System.out.println("Book not found with ID: " + id);
    }
}


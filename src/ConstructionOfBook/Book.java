package ConstructionOfBook;
//Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
//Instance variables are being initialized
//Both Constructors are being executed
public class Book {
    private String title;
    private String author;
    private int year;

    // Constructor with no arguments
    public Book() {
        // Initialize instance variables with default values
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.year = 0;
        System.out.println("Constructor with no arguments executed");
    }

    // Parameterized constructor
    public Book(String title, String author, int year) {
        // Initialize instance variables with provided values
        this.title = title;
        this.author = author;
        this.year = year;
        System.out.println("Parameterized constructor executed");
    }

    public static void main(String[] args) {
        // Create a Book object using the no-argument constructor
        Book book1 = new Book();

        // Create a Book object using the parameterized constructor
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
    }
}


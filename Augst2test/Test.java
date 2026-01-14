/*Design a simple Library Management System using classes with the following:
A Book class with fields: id, title, author.
A Library class with methods:
addBook(Book b)
listBooks()
deleteBook(int id)
Write a program to:
Add 3 books.
List all books.
Delete a book by id and display remaining books.*/


import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private int id;
    private String title;
    private String author;

    
    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    
    public void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    
    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added: " + b.getTitle());  
    }

    
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        System.out.println("List all books:");
        for (Book b : books) {
            b.display();
        }
    }

    
    public void deleteBook(int id) {
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                System.out.println("Deleting book: " + books.get(i).getTitle());  
                books.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + id + " not found.");
        }
    }
}

 class Test {
    public static void main(String[] args) {
        Library lib = new Library();

        
        lib.addBook(new Book(1, "Java", "Ritik"));
        lib.addBook(new Book(2, "C++", "Dipesh"));
        lib.addBook(new Book(3, "Python", "Tarun"));

        
        lib.listBooks();

        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter ID of  book delete: ");
        int deleteId = sc.nextInt();
        lib.deleteBook(deleteId);

       
        System.out.println("\nRemaining books in  library:");
        lib.listBooks();
    }
}

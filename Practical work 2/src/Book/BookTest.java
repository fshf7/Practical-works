package Book;

import Book.Book;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book book = new Book("Pushkin", "The Captain's daughter", 1836);
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Name: " + book.getName());
        System.out.println("Year: " + book.getYear());

        System.out.println("Enter the name of the new book: ");
        String name = scan.nextLine();
        book.setName(name);
        System.out.println("The name of the new book is: " + name);

        System.out.println(book);

        System.out.println("\nEnter an amount of books in the shelf: ");
        int amount = scan.nextInt();
        BookShelf books = new BookShelf(amount);
        books.shelfFilling();
        books.getLatestBooks();
        books.getOldestBooks();
        books.outputShelf();
        books.sortByDate();
    }
}

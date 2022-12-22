package Book;

import Book.Book;

import java.util.*;

public class BookShelf {
    private int amount;
    ArrayList<Book> books = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public BookShelf(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void shelfFilling() {
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter the Author: ");
            String author = scan.next();
            System.out.println("Enter the name of book: ");
            String name = scan.next();
            System.out.println("Enter the year: ");
            int year = scan.nextInt();
            Book book = new Book(author, name, year);
            books.add(book);
        }
    }

    public void getOldestBooks(){
        int oldestYear = books.get(0).getYear();

        for (Book bk : books) {
            if (bk.getYear() < oldestYear) { oldestYear = bk.getYear(); }
        }

        System.out.println("Books with oldest year of writing: ");
        for (Book bk : books) {
            if (bk.getYear() == oldestYear) {
                System.out.println("Author: " + bk.getAuthor() + "; Name " + bk.getName() +  "; Year: " + bk.getYear());
            }
        }
    }

    public void getLatestBooks() {
        int latestYear = books.get(0).getYear();

        for (Book bk : books) {
            if (bk.getYear() > latestYear) { latestYear = bk.getYear(); }
        }

        System.out.println("Books with latest year of writing: ");
        for (Book bk : books) {
            if (bk.getYear() == latestYear) {
                System.out.println("Author: " + bk.getAuthor() + "; Name " + bk.getName() +  "; Year: " + bk.getYear());
            }
        }
    }

    public void outputShelf() {
        System.out.println("\nAll books in the shelf: ");
        for(Book bk : books) {
            System.out.println("Author: " + bk.getAuthor() + "; Name: " + bk.getName() +  "; Year: " + bk.getYear());
        }
    }
     public void sortByDate(){
         Collections.sort(books, Comparator.comparing(Book::getYear));
         System.out.println("Your shelf is successfully sorted by date!");
         outputShelf();
     }
}

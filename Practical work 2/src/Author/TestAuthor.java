package Author;

import Author.Author;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        String email;
        Author pushkin = new Author("Alexander", "pushkiin@mail.com", 'm');
        System.out.println("Author's name: " + pushkin.getName());
        System.out.println("Author's email: " + pushkin.getEmail());
        System.out.println("Author's gender: " + pushkin.getGender());
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the email of author: ");
        email = scan.nextLine();
        pushkin.setEmail(email);
        System.out.println("The new email is: " + email);
        System.out.println(pushkin);

    }
}


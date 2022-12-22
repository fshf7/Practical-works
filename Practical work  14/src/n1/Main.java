package n1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input your string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] splitted = str.split("[-+*,/=.]");
        for (String s : splitted) {
            System.out.println(s);
        }
    }
}
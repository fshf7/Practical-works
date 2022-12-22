package n2;

public class Main {
    public static void main(String[] args) {
        String str = new String("abcdefghijklmnopqrstuv18340");
        System.out.println(str.matches("abcdefghijklmnopqrstuv18340"));
        System.out.println(str.matches("abcdefghijklmnoasdfasdpqrstuv18340"));
    }
}

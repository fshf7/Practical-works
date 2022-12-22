package n3;

public class Main {
    public static void main(String[] args) {

        String str1 = "Russia, Moscow, Moscow, Prospekt Vernadskovo, 87, 2, MIREA";
        String str2 = "Tajikistan, Sugd, B.Gafutov, Sirdaryo, 2, -, -";

        Address address = new Address(str1);
        Address address2 = new Address(str2);

        System.out.println(address.to_string());
        System.out.println(address2.to_string());
    }
}

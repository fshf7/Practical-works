package n4;

public class Main {
    public static void main(String[] args)
    {
        String str1 = "S001,Black Polo Shirt,Black,XL";
        String str2 = "S002,Black Polo Shirt,Black,L";
        String str3 = "S003,Blue Polo, Shirt,Blue,XL";

        Shirt shirt1 = new Shirt(str1);
        Shirt shirt2 = new Shirt(str2);
        Shirt shirt3 = new Shirt(str3);
        System.out.println(shirt1.to_string() + "\n");
        System.out.println(shirt2.to_string() + "\n");
        System.out.println(shirt3.to_string() + "\n");
    }
}

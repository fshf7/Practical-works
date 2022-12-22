package Shop;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Shop shop = new Shop();
        shop.add_comp();
        shop.find_comp();
        shop.rm_comps();
    }
}

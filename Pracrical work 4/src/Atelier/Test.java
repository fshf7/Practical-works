package Atelier;

import java.util.Arrays;
import java.util.SortedMap;

public class Test {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Sizes.XXS, 40, "Black"),
                new TShirt(Sizes.XS, 50, "White"),
                new TShirt(Sizes.L, 60, "Green"),
                new Tie(Sizes.M, 15, "Black"),
                new Tie(Sizes.S, 12, "Orange"),
                new Tie(Sizes.XS, 10, "Violet"),
                new Pants(Sizes.M, 50, "Black"),
                new Pants(Sizes.L, 60, "Green"),
                new Pants(Sizes.XXS, 40, "Blue"),
                new Skirt(Sizes.L, 60, "Green"),
                new Skirt(Sizes.M, 50, "White"),
                new Skirt(Sizes.M, 50, "Black"),
        };

        for (Clothes clothe : clothes) {
            System.out.println(clothe);
        }
        System.out.println();

        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        System.out.println();
        atelier.dressWoman(clothes);
    }
}

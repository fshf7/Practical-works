package Atelier;

public class Atelier {
    public void dressMan(Clothes[] clothes){
        System.out.println("Available men's clothing:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof MenClothing) {
                System.out.println(clothe);
            }
        }
    }

    public void dressWoman(Clothes[] clothes){
        System.out.println("Available women's clothing:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothing) {
                System.out.println(clothe);
            }
        }
    }
}

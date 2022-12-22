package Poker;

import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int n = scanner.nextInt();
        Card[] deck = new Card[52];
        for(int i = 0; i < deck.length; i++)
        {
            deck[i] = new Card();
            if(i < 13)
            {
                deck[i].suit = "SPADES";
                deck[i].num = deck[i].Num(i);
            }
            if(13 <= i && i < 26){
                deck[i].suit = "CLUBS";
                deck[i].num = deck[i].Num(i);
            }
            if(26 <= i && i < 39){
                deck[i].suit = "HEARTS";
                deck[i].num = deck[i].Num(i);
            }
            if(39 <= i){
                deck[i].suit = "DIAMONDS";
                deck[i].num = deck[i].Num(i);
            }
            System.out.println(deck[i].suit +" " + deck[i].num);
        }
        int size = 52;
        for(int i = 0; i < n; i++) {
            System.out.println("Cards of the " + (i + 1) + " player: ");
            for (int j = 0; j < 5; j++) {
                int rand = (int) (Math.random() * ((size) - 1));
                System.out.println(deck[rand].num + " " + deck[rand].suit);
                for(int t = rand; t < size - 1; t++) {
                    deck[t] = deck[t + 1];
                }
                size--;
            }
        }
    }
}

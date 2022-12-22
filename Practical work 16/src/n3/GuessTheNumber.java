package n3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessTheNumber {
    public static class App extends JFrame {
        JFrame jf = new JFrame("TEST");
        Image icon = Toolkit.getDefaultToolkit().getImage("src/F.png");
        //Image fon = new ImageIcon("src/fon_2.png").getImage();
        JTextField sample = new JTextField();
        int attempt = 0;
        int rndm = 1+(int)(Math.random()*20);
        boolean win = false;


        App() {
            jf.setSize(400, 300);
            jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jf.setIconImage(icon);

            jf.setLayout(new GridLayout(2, 3));

            sample.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    System.out.println("Debug of answer " + rndm);
                    System.out.println("Chance number: " + ++attempt);
                    if(Integer.parseInt(sample.getText()) < rndm){
                        JOptionPane.showMessageDialog(App.this,
                                "Your number is less than the given one"); }
                    if(Integer.parseInt(sample.getText()) > rndm){
                        JOptionPane.showMessageDialog(App.this,
                                "Your number is greater than the given one"); }
                    if(Integer.parseInt(sample.getText()) == rndm){
                        win = true;
                        JOptionPane.showMessageDialog(App.this,
                                "YES!!! You are RIGHT!"); }
                    if (win || attempt == 3) {
                        attempt = 0;
                        rndm = 1 + (int) (Math.random() * 20);
                        if (win)
                            JOptionPane.showMessageDialog(App.this,
                                    "Victory! The game starts over");
                        else
                            JOptionPane.showMessageDialog(App.this,
                                    "Three attempts spent! The game starts over");
                        win = false;
                    }
                }
            });

            jf.add(sample);
            jf.setVisible(true);
            JOptionPane.showMessageDialog(null,
                    "The game has started, enter a number from 1 to 21");
        }
    }

    public static void main(String[] args) {
        new App();
    }
}

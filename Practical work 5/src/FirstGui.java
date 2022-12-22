import javax.swing.*;
import java.awt.*;

public class FirstGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,150);
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setPreferredSize(new Dimension(200, 300));
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        panel.add(btn1);
        panel.add(btn2);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

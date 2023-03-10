package n2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Figure extends JPanel {
    public Figure() {
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(400, 400));
    }

    private Color randColor() {
        Random r = new Random();
        return new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            if (r.nextBoolean())
                (new Square(randColor(), new n2.Point(r.nextInt(350), r.nextInt(350)))).draw(g);
            else
                (new Circle(randColor(), new n2.Point(r.nextInt(350), r.nextInt(350)))).draw(g);
        }
    }

    public void run() {
        JFrame frame = new JFrame("Figures");
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

package swingKlasse;

import javax.swing.*;
import java.awt.*;

public class MyLabelGPT_Version {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("acc.png");

        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(image);

        JLabel textLabel = new JLabel("EINKAUFSPASSAGE SPIEL", SwingConstants.CENTER);
        textLabel.setForeground(new Color(0x00FF00));
        textLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));

        // Add 20px space margin to the text label
        textLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(imageLabel, BorderLayout.CENTER);
        panel.add(textLabel, BorderLayout.NORTH);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(panel);
    }
}
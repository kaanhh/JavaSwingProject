package swingKlasse;

//import java.awt.Color;
//import java.awt.Font;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyLabel {
    public static void main(String[] args){

        ImageIcon image = new ImageIcon("acc.png");

        JLabel label = new JLabel();
        label.setText("EINKAUFSPASSAGE SPIEL");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);  //set Text LEFT,CENTER,RIGHT, zum Bild
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
        label.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
    }
}

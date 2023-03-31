package swingKlasse;

import java.awt.Color;
import javax.swing.*;

public class MyFrame extends JFrame {
     
    MyFrame(){
        this.setTitle("Kaans erstes JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Auf X wird Programm geschlossen
        this.setResizable(false); //Grösse des Fensters kann nicht geändert werden.
    
        this.setSize(420, 420);  // die größe des Fensters 
        this.setVisible(true);    //macht das frame, also das sichtbare Feld sichtbar. 
         
        ImageIcon image = new ImageIcon("kaan.jpeg");
       // frame.setIconImage(image.getImage()); //change icon of frame, aber klappt nicht
       // frame.getContentPane().setBackground(Color.green); //Hintergrundfarbe ändern
        this.getContentPane().setBackground(new Color(0xFFFFFF));
    }
}

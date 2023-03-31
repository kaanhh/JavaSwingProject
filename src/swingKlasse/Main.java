package swingKlasse;

import java.awt.Color;
import javax.swing.*;

public class Main{
    public static void main(String[] args) throws Exception {

        JLabel label = new JLabel();  //erstellt eine TextZeile
        label.setText("Bro, can you even code?"); //setzt den Text um
       
    /*
    JFrame frame = new JFrame(); //erzeugt ein neues frame Objekt
    frame.setTitle("Kaans erstes JFrame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Auf X wird Programm geschlossen
    frame.setResizable(false); //Grösse des Fensters kann nicht geändert werden.

    frame.setSize(420, 420);  // die größe des Fensters 
    frame.setVisible(true);    //macht das frame, also das sichtbare Feld sichtbar. 
     
    ImageIcon image = new ImageIcon("kaan.jpeg");
   // frame.setIconImage(image.getImage()); //change icon of frame, aber klappt nicht
   // frame.getContentPane().setBackground(Color.green); //Hintergrundfarbe ändern
    frame.getContentPane().setBackground(new Color(0xFFFFFF));
    */

        MyFrame myFrame = new MyFrame();
        
    }
}

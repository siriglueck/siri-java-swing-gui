import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to

        JFrame frame = new JFrame(); // create a frame
        frame.setTitle("JFrame title goes here"); // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit after close button
        frame.setSize(420,420); // set x and y size of frame
        frame.setResizable(false); // prevent resizing frame
        frame.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("siri-logo.png"); // create an ImageIcon
        frame.setIconImage(image.getImage()); // change the icon of the frame

        frame.getContentPane().setBackground(new Color(123,50,250)); // change color of background
    }
}
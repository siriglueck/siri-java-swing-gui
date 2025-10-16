import javax.swing.*;
import java.awt.*;
// import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        // ## JFrame = a GUI window to add components to ##
        /*
        JFrame frame = new JFrame(); // create a frame
        frame.setTitle("JFrame title goes here"); // sets title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit after close button
        frame.setSize(420,420); // set x and y size of frame
        frame.setResizable(false); // prevent resizing frame
        frame.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("siri-logo.png"); // create an ImageIcon
        frame.setIconImage(image.getImage()); // change the icon of the frame

        frame.getContentPane().setBackground(new Color(123,50,250)); // change color of background
         */
        MyFrame myFrame = new MyFrame(); // create an instance
        //myFrame.setLayout(null);

        // ## JButton 1/3
        /*
        // ## JLabel = a GUI display area for a string of text, an image, or both ##
        JLabel label = new JLabel(); // create a label
        label.setText("Bro, do you even code?"); // set text of label
        myFrame.add(label); // add label to the frame
        ImageIcon image = new ImageIcon("siri-logo.png");
        label.setIcon(image); // add image to the label
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageicon
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.RIGHT); // set horizontal positon of icon+text within label
       /*
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal positon of icon+text within label
        label.setForeground(new Color(0x00FF00)); //Color.white is also possible
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font of text
        label.setIconTextGap(-10); // set gap pf text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // this is to make label background visible (can also resize)

        Border border = BorderFactory.createLineBorder(Color.green,3); // create a border
        label.setBorder(border);

        // label.setBounds(75, 75, 250, 250); // set x,y position within frame as well as dimensions
        // myFrame.setLayout(null); // default is Border Layout, set to null so that the size of the label will not take the full space
        // so instead of above, we can use pack with label
        myFrame.pack(); // ! has to come after all frame.add() automatically adjust the frame size following contents inside
        */

        // ## JPanel = a GUI component that functions as a container to hold other components
        /*
        // because we setLayout to null so we have to define panel size
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        myFrame.add(redPanel);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        myFrame.add(bluePanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        myFrame.add(greenPanel);

        greenPanel.setLayout(new BorderLayout()); // Important setLayout before adding label
        greenPanel.add(label);
        */

        // ## JButton 2/3
        /*
        MyButton myButton = new MyButton();
        myFrame.add(myButton);
        */

        // ## Border Layout
        myFrame.setLayout(new BorderLayout(10,10));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.yellow);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.green);
        panel5.setBackground(Color.white);

        myFrame.add(panel1, BorderLayout.NORTH);
        myFrame.add(panel2, BorderLayout.SOUTH);
        myFrame.add(panel3, BorderLayout.EAST);
        myFrame.add(panel4, BorderLayout.WEST);
        myFrame.add(panel5, BorderLayout.CENTER);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        // -- sub layout
        panel5.setLayout(new BorderLayout(10,10));

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.gray);
        panel8.setBackground(Color.lightGray);
        panel9.setBackground(Color.darkGray);

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.SOUTH);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.WEST);




        myFrame.setVisible(true); // make frame visible
        //either move the setVisible to here or call both below functions to rerender
        //myFrame.repaint();
        //myFrame.revalidate();

    }
}
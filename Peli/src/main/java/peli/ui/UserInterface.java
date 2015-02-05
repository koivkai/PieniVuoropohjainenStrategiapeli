package peli.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

    private JFrame frame;

    public UserInterface() {
    }

    @Override
    public void run() {
        frame = new JFrame("PieniVuoropohjainenStrategiapeli");
        frame.setPreferredSize(new Dimension(800, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        frame.pack();
        frame.setVisible(true);
    }

}

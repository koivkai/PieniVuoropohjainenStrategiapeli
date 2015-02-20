package peli.ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Canvas canvas;

    public UserInterface() {
    }

    @Override
    public void run() {
        frame = new JFrame("PieniVuoropohjainenStrategiapeli");
        frame.setPreferredSize(new Dimension(1200, 840));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
        

        createComponents(frame.getContentPane());
        

        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        canvas = new Canvas();
        container.add(canvas);
    }

    

}

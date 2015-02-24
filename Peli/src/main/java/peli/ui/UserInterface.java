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
import peli.logic.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Canvas canvas;
    private Duel duel;

    public UserInterface(Duel duel) {
        this.duel = duel;
    }

    @Override
    public void run() {
        frame = new JFrame("PieniVuoropohjainenStrategiapeli");
        frame.setPreferredSize(new Dimension(1200, 840));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        frame.setResizable(false);
        

        createComponents(frame.getContentPane());
        

        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        canvas = new Canvas(this.duel);
        container.add(canvas);
        frame.addMouseListener(new ClickDetector(this.duel, container));
    }

    

}

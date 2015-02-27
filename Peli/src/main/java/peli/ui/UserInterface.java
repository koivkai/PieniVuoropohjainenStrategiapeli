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
    private Game duel;

    public UserInterface(Game duel) {
        this.duel = duel;
    }

    @Override
    public void run() {
        frame = new JFrame("PieniVuoropohjainenStrategiapeli");
        frame.setPreferredSize(new Dimension(1200, 830));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setResizable(false);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(null);
        JButton endTurnButton = new JButton("End Turn");
        JButton captureButton = new JButton("Capture");
        JButton buildButton = new JButton("Build Unit");
        JButton attackButton = new JButton("Attack");
        EndOfTurnListener endOfTurnListener = new EndOfTurnListener(this.duel);
        CaptureListener captureLister = new CaptureListener(this.duel, container);
        BuildUnitListener buildUnitListener = new BuildUnitListener(this.duel, container);
        AttackListener attackLister = new AttackListener(this.duel, container);
        endTurnButton.addActionListener(endOfTurnListener);
        captureButton.addActionListener(captureLister);
        buildButton.addActionListener(buildUnitListener);
        attackButton.addActionListener(attackLister);
        canvas = new Canvas(this.duel, endTurnButton, captureButton, buildButton, attackButton);
        canvas.setBounds(0, 0, 1200, 840);
        container.add(canvas);

        endTurnButton.setBounds(1050, 650, 100, 50);
        captureButton.setBounds(1050, 330, 100, 50);
        buildButton.setBounds(50, 330, 100, 50);
        attackButton.setBounds(50, 500, 100, 50);
        container.add(endTurnButton);
        container.add(captureButton);
        container.add(buildButton);
        container.add(attackButton);
        frame.addMouseListener(new ClickDetector(this.duel, container));

    }

}

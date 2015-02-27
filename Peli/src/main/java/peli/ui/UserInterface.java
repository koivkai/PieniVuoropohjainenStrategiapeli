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

/**
 * Käyttöliittymän äitiluokka joka luo kaikki muut luokat ja koko
 * käyttöliittymän.
 */
public class UserInterface implements Runnable {

    private JFrame frame;
    private Canvas canvas;
    private Game game;

    /**
     * Interface konstruktori
     *
     *
     * @param game tarvitaan jotta interface liittyisi otenkin pelin tapahtumiin
     */
    public UserInterface(Game game) {
        this.game = game;
    }

    /**
     * Metodi luo ikkunan pelille ja estää sen koon muuttamisen. Metodi kutsuu
     * createComponents metodia, joka luo käyttöliittymän varsinaisen sisällön.
     */
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

    /**
     * Metodi luo Canvaksen, joka maalaa varsinaisen pelialueen ja kaiken mitä
     * siellä on. Luo myös napit ja nappien kuuntelijat. Luokka asettaa layoutin
     * nulliksi eli absoluuttiseen layouttiin, tämä ei tunnu toimivan macilla,
     * jolla napit eivät näy paisi jos laitttaa layoutiksi new
     * BoxLayout(component, 1) , joskin tällöin kartan ala osa ei näy ja nappien
     * paikat tietenkin siirtyvät.
     */
    private void createComponents(Container container) {

        container.setLayout(null);

        JButton endTurnButton = new JButton("End Turn");
        JButton captureButton = new JButton("Capture");
        JButton buildButton = new JButton("Build Unit");
        JButton attackButton = new JButton("Attack");

        EndOfTurnListener endOfTurnListener = new EndOfTurnListener(this.game);
        CaptureListener captureLister = new CaptureListener(this.game, container);
        BuildUnitListener buildUnitListener = new BuildUnitListener(this.game, container);
        AttackListener attackLister = new AttackListener(this.game, container);

        endTurnButton.addActionListener(endOfTurnListener);
        captureButton.addActionListener(captureLister);
        buildButton.addActionListener(buildUnitListener);
        attackButton.addActionListener(attackLister);

        endTurnButton.setBounds(1050, 650, 100, 50);
        captureButton.setBounds(1050, 330, 100, 50);
        buildButton.setBounds(50, 330, 100, 50);
        attackButton.setBounds(50, 500, 100, 50);

        container.add(endTurnButton);
        container.add(captureButton);
        container.add(buildButton);
        container.add(attackButton);

        canvas = new Canvas(this.game, endTurnButton, captureButton, buildButton, attackButton);
        canvas.setBounds(0, 0, 1200, 840);
        container.add(canvas);

        frame.addMouseListener(new ClickDetector(this.game, container));

    }

}

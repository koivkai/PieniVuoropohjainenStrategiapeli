package peli.ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.*;
import javax.swing.*;
import javax.swing.JLabel;
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

        createBasiclayout(frame.getContentPane());

        Container mapUpLeft = new Container();
        Container mapUpRight = new Container();
        Container mapDownLeft = new Container();
        Container mapDwonLeft = new Container();

        setMapSegmentLayout(mapUpLeft);
        setMapSegmentLayout(mapUpRight);
        setMapSegmentLayout(mapDownLeft);
        setMapSegmentLayout(mapDwonLeft);
        
        mapUpLeft.setVisible(true);
        
        JLabel t1 = new JLabel("1");
        mapUpLeft.add(t1);
        JLabel t2 = new JLabel("2");
        mapUpLeft.add(t2);
        JLabel t3 = new JLabel("3");
        mapUpLeft.add(t3);
        JLabel t4 = new JLabel("4");
        mapUpLeft.add(t4);
        JLabel t5 = new JLabel("5");
        mapUpLeft.add(t5);

        frame.pack();
        frame.setVisible(true);
    }

    protected void createBasiclayout(Container container) {
        GridLayout biglayout = new GridLayout(2, 4);

        container.setLayout(biglayout);
        JLabel teksti = new JLabel("Tekstikenttä!1");
        container.add(teksti);

        JLabel teksti2 = new JLabel("Tekstikenttä!2");
        container.add(teksti2);
        JLabel teksti3 = new JLabel("Tekstikenttä!3");
        container.add(teksti3);
        JLabel teksti4 = new JLabel("Tekstikenttä!4");
        container.add(teksti4);
        JLabel teksti5 = new JLabel("Tekstikenttä!5");
        container.add(teksti5);
        JLabel teksti6 = new JLabel("Tekstikenttä!6");
        container.add(teksti6);
        JLabel teksti7 = new JLabel("Tekstikenttä!7");
        container.add(teksti7);
        JLabel teksti8 = new JLabel("Tekstikenttä!8");
        container.add(teksti8);

    }

    protected void setMapSegmentLayout(Container segment) {
        GridLayout mapSegmentLayout = new GridLayout(2, 4);
        segment.setLayout(mapSegmentLayout);
    }

}

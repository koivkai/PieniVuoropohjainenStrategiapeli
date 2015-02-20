

package peli.ui; 

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

 
public class Canvas extends JPanel{
    
    public Canvas() {
        super.setBackground(Color.WHITE);
    }

   @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        
        BufferedImage plains = null;
        try {
            plains = ImageIO.read(new File("images/PlainsTile.png"));
        } catch (IOException ex) {
            
        }
        
        graphics.drawImage(plains, 0, 0, this);
        
        int y = 0;
        int a = 0;
        for (int i2=0; i2 <20; i2++) {
            
            int x = 200;
        
        for (int i= 0; i < 20; i++) {
            if (a == 0) {
                graphics.setColor(Color.red);
                a++;
            }
            else if (a ==1) {
                graphics.setColor(Color.BLACK);
                a++;
            }else if (a ==2) {
                graphics.setColor(Color.PINK);
                a++;
            }
            else if (a ==3) {
                graphics.setColor(Color.YELLOW);
                a++;
            }
            else if (a ==4) {
                graphics.setColor(Color.DARK_GRAY);
                a++;
            }
            else if (a ==5) {
                graphics.setColor(Color.orange);
                a++;
            }
            else if (a ==6) {
                graphics.setColor(Color.GREEN);
                a++;
            }
            else if (a ==7) {
                graphics.setColor(Color.CYAN);
                a++;
            }
            else if (a ==8) {
                graphics.setColor(Color.gray);
                a++;
            }
            else if (a ==9) {
                graphics.setColor(Color.pink);
                a++;
            }
            else if (a ==10) {
                graphics.setColor(Color.GREEN);
                a++;
            }
            else if (a ==11) {
                graphics.setColor(Color.RED);
                a++;
            }
             else {
                graphics.setColor(Color.CYAN);
                a = 0;
            }
            
            graphics.fillRect(x, y, 40, 40);
            x = x + 40;
            
        }
            x= 200;
            y = y+40;
            
        }
        
        
        
//        graphics.fillRect(300, 200, 50, 50);

    }

} 
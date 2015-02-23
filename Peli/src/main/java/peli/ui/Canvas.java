

package peli.ui; 

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import peli.logic.*;

 
public class Canvas extends JPanel{
    
    private Duel duel;
    
    public Canvas(Duel duel) {
        super.setBackground(Color.WHITE);
        this.duel = duel;
    }

   @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        
        BufferedImage plains = null;
        try {
            plains = ImageIO.read(new File("images/PlainsTile.png"));
        } catch (IOException ex) {
            
        }
        
        BufferedImage forest = null;
        try {
            forest = ImageIO.read(new File("images/Forest.png"));
        } catch (IOException ex) {
            
        }
        
        BufferedImage mountains = null;
        try {
            mountains = ImageIO.read(new File("images/mountainsTile.png"));
        } catch (IOException ex) {
            
        }
        
        BufferedImage neutralMine = null;
        try {
            neutralMine = ImageIO.read(new File("images/neutralMine.png"));
        } catch (IOException ex) {
            
        }
        
        BufferedImage neutralFarm = null;
        try {
            neutralFarm = ImageIO.read(new File("images/neutralFarm.png"));
        } catch (IOException ex) {
            
        }
        
        BufferedImage neutralOutpost = null;
        try {
            neutralOutpost = ImageIO.read(new File("images/neutralOutpost.png"));
        } catch (IOException ex) {
            
        }
        
        BufferedImage redHQ = null;
        try {
            redHQ = ImageIO.read(new File("images/redHQ.png"));
        } catch (IOException ex) {
            
        }
        
        BufferedImage roadVertical = null;
        try {
            roadVertical = ImageIO.read(new File("images/roadVertical.png"));
        } catch (IOException ex) {
            
        }
        
        BufferedImage roadUpRightDown = null;
        try {
            roadUpRightDown = ImageIO.read(new File("images/roadUpRightDown.png"));
        } catch (IOException ex) {
            
        }
        
        BufferedImage roadHorizontal = null;
        try {
            roadHorizontal = ImageIO.read(new File("images/roadHorizontal.png"));
        } catch (IOException ex) {
            
        }
        
        BufferedImage roadUpLeftDown = null;
        try {
            roadUpLeftDown = ImageIO.read(new File("images/roadUpLeftDown.png"));
        } catch (IOException ex) {
            
        }
        
        BufferedImage roadDownToLeft = null;
        try {
            roadDownToLeft = ImageIO.read(new File("images/roadDownToLeft.png"));
        } catch (IOException ex) {
            
        }
        BufferedImage roadDownToRight = null;
        try {
            roadDownToRight = ImageIO.read(new File("images/roadDownToRight.png"));
        } catch (IOException ex) {
            
        }
        BufferedImage roadUpToLeft = null;
        try {
            roadUpToLeft = ImageIO.read(new File("images/roadUpToLeft.png"));
        } catch (IOException ex) {
            
        }
        BufferedImage roadUpToRight = null;
        try {
            roadUpToRight = ImageIO.read(new File("images/roadUpToRight.png"));
        } catch (IOException ex) {
            
        }
        BufferedImage blueHQ = null;
        try {
            blueHQ = ImageIO.read(new File("images/blueHQ.png"));
        } catch (IOException ex) {
            
        }
        
//        this.scenario.getMap().getNumberOFRows();
        
        graphics.drawImage(plains, 0, 0, this);
        
        int y = 0;
        int t = 0;
        for (int i= 0; i < 20; i++) {
            
            int x = 200;
            
            for (int i2= 0; i2 < 20; i2++) {
                if (t < this.duel.getMap().getTiles().size()) {
                    Tile tile = this.duel.getMap().getTiles().get(t);
                    BufferedImage imageToDraw = null;
                    
                    if (tile.getType() == TileType.PLAINS) {
                        imageToDraw = plains;
                    }
                    
                    if (tile.getType() == TileType.FOREST) {
                        imageToDraw = forest;
                    }
                    
                    if (tile.getType() == TileType.MOUNTAINS) {
                        imageToDraw = mountains;
                    }
                    
                    if (tile.getType() == TileType.MINENEUTRAL) {
                        imageToDraw = neutralMine;
                    }
                    if (tile.getType() == TileType.FARMNEUTRAL) {
                        imageToDraw = neutralFarm;
                    }
                    if (tile.getType() == TileType.OUTPOSTNEUTRAL) {
                        imageToDraw = neutralOutpost;
                    }
                    if (tile.getType() == TileType.REDHQ) {
                        imageToDraw = redHQ;
                    }
                    if (tile.getType() == TileType.ROADVERTICAL) {
                        imageToDraw = roadVertical;
                    }
                    if (tile.getType() == TileType.ROADUPRIGHTDOWN) {
                        imageToDraw = roadUpRightDown;
                    }
                    if (tile.getType() == TileType.ROADHORIZONTAL) {
                        imageToDraw = roadHorizontal;
                    }
                    if (tile.getType() == TileType.ROADUPLEFTDOWN) {
                        imageToDraw = roadUpLeftDown;
                    }
                    if (tile.getType() == TileType.ROADDOWNTOLEFT) {
                        imageToDraw = roadDownToLeft;
                    }
                    if (tile.getType() == TileType.ROADDOWNTORIGHT) {
                        imageToDraw = roadDownToRight;
                    }
                    if (tile.getType() == TileType.ROADUPTOLEFT) {
                        imageToDraw = roadUpToLeft;
                    }
                    if (tile.getType() == TileType.ROADUPTORIGHT) {
                        imageToDraw = roadUpToRight;
                    }
                    if (tile.getType() == TileType.BLUEHQ) {
                        imageToDraw = blueHQ;
                    }
                    
                    if (imageToDraw != null) {
                        graphics.drawImage(imageToDraw, x, y, this);
                    }
                    t++;
                    x = x + 40;
                }
            }
            
            
            y = y+40;
            
        }
        
////        int y2 = 0;
////        int a = 0;
////        for (int i2=0; i2 <20; i2++) {
////            
////            int x = 200;
////        
////        for (int i= 0; i < 20; i++) {
////            if (a == 0) {
////                graphics.setColor(Color.red);
////                a++;
////            }
////            else if (a ==1) {
////                graphics.setColor(Color.BLACK);
////                a++;
////            }else if (a ==2) {
////                graphics.setColor(Color.PINK);
////                a++;
////            }
////            else if (a ==3) {
////                graphics.setColor(Color.YELLOW);
////                a++;
////            }
////            else if (a ==4) {
////                graphics.setColor(Color.DARK_GRAY);
////                a++;
////            }
////            else if (a ==5) {
////                graphics.setColor(Color.orange);
////                a++;
////            }
////            else if (a ==6) {
////                graphics.setColor(Color.GREEN);
////                a++;
////            }
////            else if (a ==7) {
////                graphics.setColor(Color.CYAN);
////                a++;
////            }
////            else if (a ==8) {
////                graphics.setColor(Color.gray);
////                a++;
////            }
////            else if (a ==9) {
////                graphics.setColor(Color.pink);
////                a++;
////            }
////            else if (a ==10) {
////                graphics.setColor(Color.GREEN);
////                a++;
////            }
////            else if (a ==11) {
////                graphics.setColor(Color.RED);
////                a++;
////            }
////             else {
////                graphics.setColor(Color.CYAN);
////                a = 0;
////            }
////            
////            graphics.fillRect(x, y2, 40, 40);
////            x = x + 40;
////            
////        }
////            x= 200;
////            y2 = y2+40;
////            
////        }
        
        
        
        

    }

} 
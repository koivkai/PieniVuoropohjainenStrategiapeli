package peli.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import peli.logic.*;

public class Canvas extends JPanel {

    private Game duel;
    private JButton endTurnButton;
    private JButton captureButton;
    private JButton buildButton;
    private JButton attackButton;

    public Canvas(Game duel, JButton endTurnButton, JButton captureButton, JButton buildButton, JButton attackButton) {
        super.setBackground(Color.WHITE);
        this.duel = duel;
        this.endTurnButton = endTurnButton;
        this.captureButton = captureButton;
        this.buildButton = buildButton;
        this.attackButton = attackButton;
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

        int y = 0;
        int t = 0;
        for (int i = 0; i < 20; i++) {

            int x = 200;

            for (int i2 = 0; i2 < 20; i2++) {
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
                        tile.setUiX(x);
                        tile.setUiY(y);
                    }
                    t++;
                    x = x + 40;
                }
            }

            y = y + 40;

        }

        BufferedImage redFarm = null;
        try {
            redFarm = ImageIO.read(new File("images/redFarm.png"));
        } catch (IOException ex) {

        }

        BufferedImage blueFarm = null;
        try {
            blueFarm = ImageIO.read(new File("images/blueFarm.png"));
        } catch (IOException ex) {

        }

        BufferedImage blueMine = null;
        try {
            blueMine = ImageIO.read(new File("images/blueMine.png"));
        } catch (IOException ex) {

        }

        BufferedImage redMine = null;
        try {
            redMine = ImageIO.read(new File("images/redMine.png"));
        } catch (IOException ex) {

        }

        BufferedImage blueOutpost = null;
        try {
            blueOutpost = ImageIO.read(new File("images/blueOutpost.png"));
        } catch (IOException ex) {

        }

        BufferedImage redOutpost = null;
        try {
            redOutpost = ImageIO.read(new File("images/redOutpost.png"));
        } catch (IOException ex) {

        }

        for (Building building : this.duel.getBuildings().getBuildings()) {
            BufferedImage buildingImage = null;
            if (building.getTile().getType() == TileType.FARMNEUTRAL && building.getPlayer() == this.duel.getPlayer1()) {
                buildingImage = blueFarm;
            } else if (building.getTile().getType() == TileType.FARMNEUTRAL && building.getPlayer() == this.duel.getPlayer2()) {
                buildingImage = redFarm;
            } else if (building.getTile().getType() == TileType.MINENEUTRAL && building.getPlayer() == this.duel.getPlayer1()) {
                buildingImage = blueMine;
            } else if (building.getTile().getType() == TileType.MINENEUTRAL && building.getPlayer() == this.duel.getPlayer2()) {
                buildingImage = redMine;
            } else if (building.getTile().getType() == TileType.OUTPOSTNEUTRAL && building.getPlayer() == this.duel.getPlayer1()) {
                buildingImage = blueOutpost;
            } else if (building.getTile().getType() == TileType.OUTPOSTNEUTRAL && building.getPlayer() == this.duel.getPlayer2()) {
                buildingImage = redOutpost;
            } else if (building.getTile().getType() == TileType.OUTPOSTNEUTRAL && building.getPlayer() == null) {
                buildingImage = neutralOutpost;
            } else if (building.getTile().getType() == TileType.FARMNEUTRAL && building.getPlayer() == null) {
                buildingImage = neutralFarm;
            } else if (building.getTile().getType() == TileType.MINENEUTRAL && building.getPlayer() == null) {
                buildingImage = neutralMine;
            } else if ((building.getTile().getType() == TileType.REDHQ || building.getTile().getType() == TileType.BLUEHQ) && building.getPlayer() == this.duel.getPlayer2()) {
                buildingImage = redHQ;
            } else if ((building.getTile().getType() == TileType.REDHQ || building.getTile().getType() == TileType.BLUEHQ) && building.getPlayer() == this.duel.getPlayer1()) {
                buildingImage = blueHQ;
            }

            if (buildingImage != null) {
                graphics.drawImage(buildingImage, building.getTile().getUiX(), building.getTile().getUiY(), this);
            }
        }

        BufferedImage UnitBlueSpearman = null;
        try {
            UnitBlueSpearman = ImageIO.read(new File("images/UnitBlueSpearman.png"));
        } catch (IOException ex) {

        }

        BufferedImage UnitRedSpearman = null;
        try {
            UnitRedSpearman = ImageIO.read(new File("images/UnitRedSpearman.png"));
        } catch (IOException ex) {

        }

        for (Unit unit : this.duel.getPlayer1().getArmy().getUnits()) {
            BufferedImage unitImage = null;

            if (unit.getName().equals("Spearman")) {
                unitImage = UnitBlueSpearman;
            }

            if (unitImage != null) {
                graphics.drawImage(unitImage, unit.getTile().getUiX(), unit.getTile().getUiY(), this);
            }

        }

        for (Unit unit : this.duel.getPlayer2().getArmy().getUnits()) {
            BufferedImage unitImage = null;

            if (unit.getName().equals("Spearman")) {
                unitImage = UnitRedSpearman;
            }

            if (unitImage != null) {
                graphics.drawImage(unitImage, unit.getTile().getUiX(), unit.getTile().getUiY(), this);
            }

        }
        this.endTurnButton.repaint();
        this.captureButton.repaint();
        this.buildButton.repaint();
        this.attackButton.repaint();

        if (this.duel.getWinner() != null) {
            BufferedImage winScreen = null;

            if (this.duel.getWinner() == this.duel.getPlayer1()) {
                BufferedImage player1WinScreen = null;
                try {
                    player1WinScreen = ImageIO.read(new File("images/player1WinScreen.png"));
                } catch (IOException ex) {

                }
                winScreen = player1WinScreen;
            }
            
            else {
                BufferedImage player2WinScreen = null;
                try {
                    player2WinScreen = ImageIO.read(new File("images/player2WinScreen.png"));
                } catch (IOException ex) {

                }
                winScreen = player2WinScreen;
            }
            
            graphics.drawImage(winScreen, 0, 0, this);
        }
    }

}

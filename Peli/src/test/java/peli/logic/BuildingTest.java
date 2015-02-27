/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peli.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vesa
 */
public class BuildingTest {
    
    private Building building;
    private Player p1;
    private Tile tile;
    
    public BuildingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p1 = new HumanPlayer();
        tile = new Tile(0, 0, TileType.PLAINS);
        this.building = new Building ("Test" , p1 , tile);
    }
    
    @After
    public void tearDown() {
    }

   @Test
   public void ConstuctorWorks() { // testaa vain niitä arvoja joita tosiasiassa käytetään
       assertEquals(this.building.getNimi(), "Test");
       assertEquals(this.building.getHasBuild(), false);
       assertEquals(this.building.getPlayer(), p1);
       assertEquals(this.tile, this.building.getTile());
   }
    
}

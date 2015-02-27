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
import peli.logic.Unit;
import peli.logic.Tile;
import peli.logic.TileType;
import peli.logic.Army;

public class UnitTest {

//    private Tile tile;
//    private Unit unit;
//    private Unit unit2;
    public UnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
//        Tile tile = new Tile(0, 0, TileType.PLAINS);
//        Unit unit = new Unit(1, 0.1, 5, 20, tile, "name");
//        Unit unit2 = new Unit(1, 0.1, 5, 20, tile, "name");

    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
//        Tile tile = new Tile(0, 0, TileType.PLAINS);
//        Unit unit = new Unit(1, 0.1, 5, 20, tile, "name");
//        Unit unit2 = new Unit(1, 0.1, 5, 20, tile, "name");
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testAttack() {
        Player p1 = new HumanPlayer();
        Player p2 = new HumanPlayer();
        Tile tile = new Tile(0, 0, TileType.PLAINS);
        Unit unit = new Unit(1, 0.1, 5, 20, tile, "name",p1);
        Unit unit2 = new Unit(1, 0.1, 5, 20, tile, "name",p2);
        unit.Attack(unit2);
        assertEquals(15.5, unit2.getHP(), 0.1);
    }
    
    @Test
    public void testMove() {
        
    }
    
    @Test
    public void testCapture() {
        
    }
    
    
    
    
}

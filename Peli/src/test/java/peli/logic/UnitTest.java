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
        Tile tile = new Tile(0, 0, TileType.PLAINS);
        Unit unit = new Unit(1, 0.1, 5, 20, tile, "name");
        Unit unit2 = new Unit(1, 0.1, 5, 20, tile, "name");
        unit.Attack(unit2);
        assertEquals(15.5, unit2.getHP(), 0.1);
    }
    
    @Test
    public void testMove() {
        
    }
    
    @Test
    public void testCapture() {
        
    }
    
    @Test
    public void testTakeDamageNOTLethal() {
        Tile tile = new Tile(0, 0, TileType.PLAINS);
        Unit unit = new Unit(1, 0.1, 5, 20, tile, "name");
        unit.TakeDamage(10);
        assertEquals(10, unit.getHP(), 0.1);
    }
    
    @Test
    public void testTakeDamageLethalANDDie() {
        Army army = new Army();
        HumanPlayer player = new HumanPlayer();
        player.setArmy(army);
        Tile tile = new Tile(0, 0, TileType.PLAINS);
        Unit unit = new Unit(1, 0.1, 5, 20, tile, "name");
        unit.setPlayer(player);
        army.addUnit(unit);
        unit.TakeDamage(100);
        assertEquals(0, army.getUnits().size());
    }
    
}

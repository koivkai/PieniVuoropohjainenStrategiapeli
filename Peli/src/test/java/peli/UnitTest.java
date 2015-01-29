
package peli;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import peli.Tile;
import peli.Unit;
import static org.junit.Assert.*;
import peli.*;

/**
 *
 * @author Vesa
 */
public class UnitTest {

    public UnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        Tile tile = new Tile(1, 1, TileType.PLAINS);
        Unit unit = new Unit(1, 1, 2, 12, tile, "name");
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Tile tile = new Tile(1, 1, TileType.PLAINS);
        Unit unit = new Unit(1, 1, 2, 12, tile, "name");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAttack() {

    }

    /**
     * Test of Move method, of class Unit.
     */
    @Test
    public void testMove() {
        
    }

    
    @Test
    public void testCapture() {
        
    }

    
    @Test
    public void testGetDefence() {
        
    }

    
    @Test
    public void testGetTile() {
        
    }

   
    @Test
    public void testTakeDamage() {
        Tile tile = new Tile(1, 1, TileType.PLAINS);
        Unit unit = new Unit(1, 1, 2, 12, tile, "name");
        
        unit.TakeDamage(2);
        assertEquals(10.0, unit.getHP(), 1);
        unit.TakeDamage(5);
        assertEquals(5.0, unit.getHP(), 1);
        
    }

    /**
     * Test of Die method, of class Unit.
     */
    @Test
    public void testDie() {
        
    }

}


package peli;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import peli.Tile;
import peli.TileType;
import static org.junit.Assert.*;

/**
 *
 * @author Vesa
 */
public class TileTest {

    public TileTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void constructorHandlesEnumsCorrectly() {
        Tile tile = new Tile(0, 0, TileType.PLAINS);
        
        
        assertEquals(tile.getMovement(), 1);
        

    }

    
    @Test
    public void testGetDefence() {
        
    }

    /**
     * Test of getMovement method, of class Tile.
     */
    @Test
    public void testGetMovement() {
        
    }

    

    
    }

    



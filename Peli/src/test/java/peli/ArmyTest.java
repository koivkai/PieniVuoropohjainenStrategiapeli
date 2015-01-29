package peli;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import peli.Army;
import peli.Army;
import peli.Tile;
import peli.TileType;
import peli.Unit;
import peli.Unit;
import peli.TileType;
/**
 *
 * @author Kaius
 */
public class ArmyTest {
    
    public ArmyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Army testArmy = new Army();
        
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testAddUnit() {
        Army testArmy2 = new Army();
        Tile tile = new Tile(1, 1, TileType.PLAINS);
        Unit unit = new Unit(1, 1, 2, 12, tile, "name");
        testArmy2.addUnit(unit);
        assertEquals(testArmy2.getUnits().size(), 1);
    }
    
}

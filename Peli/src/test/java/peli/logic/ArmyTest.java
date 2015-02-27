package peli.logic;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddUnit() {
        Army testArmy2 = new Army();
        Tile tile = new Tile(1, 1, TileType.PLAINS);
        Player p1 = new HumanPlayer();
        Unit unit = new Unit(1, 1, 2, 12, tile, "name", p1);
        testArmy2.addUnit(unit);
        assertEquals(testArmy2.getUnits().size(), 1);
    }

    @Test
    public void testRemoveUnit() {
        Army testArmy2 = new Army();
        Player p1 = new HumanPlayer();
        Tile tile = new Tile(1, 1, TileType.PLAINS);
        Unit unit = new Unit(1, 1, 2, 12, tile, "name", p1);
        testArmy2.addUnit(unit);
        testArmy2.removeUnit(unit);
        assertEquals(testArmy2.getUnits().size(), 0);
    }

}

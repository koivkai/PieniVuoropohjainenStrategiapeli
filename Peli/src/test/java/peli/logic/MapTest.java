package peli.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MapTest {

    private Map map;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        map = new Map(10, 20);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void MapConstructorTest() {
        assertEquals(20, map.getNumberOFRows());
        assertEquals(10, map.getRowLength());
    }

    @Test
    public void AddingTilesWorks() {
        Tile tile = new Tile(1, 1, TileType.PLAINS);
        Tile tile2 = new Tile(2, 1, TileType.PLAINS);
        map.addTile(tile);
        map.addTile(tile2);

        assertEquals(2, this.map.getTiles().size());
    }

}

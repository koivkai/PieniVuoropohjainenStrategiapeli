package peli.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BuildingListTest {

    private BuildingList list;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        list = new BuildingList();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void TestAddBuilding() {
        Player p1 = new HumanPlayer();
        Tile tile = new Tile(0, 0, TileType.PLAINS);
        Building building = new Building("Test", p1, tile);
        list.addBuilding(building);
        assertEquals(1, list.getBuildings().size());
    }

}

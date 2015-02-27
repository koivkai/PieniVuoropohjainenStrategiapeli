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

public class GameTest {

    private Player p1;
    private Player p2;
    private Game game;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        p1 = new HumanPlayer();
        p2 = new HumanPlayer();
        game = new Game(p1, p2);
        game.setUpScenario();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testBuildMap() {

    }

    @Test
    public void testPlaceBuildings() {

    }

    @Test
    public void testPlaceStartingUnits() {

    }

    @Test
    public void ConstructorTest() {
        assertEquals(p1, this.game.getPlayer1());
        assertEquals(p2, this.game.getPlayer2());
    }

    @Test
    public void MapIsBuild() {
        assertEquals(20, this.game.getMap().getNumberOFRows());
        assertEquals(20, this.game.getMap().getRowLength());
        assertEquals(400, this.game.getMap().getTiles().size());
    }

    @Test
    public void BuildingsGetPlacedCorrectly() {
        assertEquals(38, this.game.getBuildings().getBuildings().size());

        Building testBuilding1 = this.game.getBuildings().getBuildings().get(10);
        assertEquals("Farm", testBuilding1.getNimi());

        Building testBuilding2 = this.game.getBuildings().getBuildings().get(11);
        assertEquals("Outpost", testBuilding2.getNimi());
    }

    @Test
    public void UnitsGetPlacedCorrectly() {
        assertEquals(2, this.game.getPlayer1().getArmy().getUnits().size());
        assertEquals(2, this.game.getPlayer2().getArmy().getUnits().size());

        Unit unit1 = this.game.getPlayer1().getArmy().getUnits().get(0);

        assertEquals(p1, unit1.getPlayer());
        assertEquals("Spearman", unit1.getName());
        assertEquals(3, unit1.getMP());
        assertEquals(15, unit1.getAttack(), 0.1);
        assertEquals(0.2, unit1.getDefence(), 0.1);
        assertEquals(20, unit1.getHP(), 0.1);
    }
}

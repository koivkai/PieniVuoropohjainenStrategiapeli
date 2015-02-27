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

    public UnitTest() {
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
    public void testAttack() {
        Player p1 = new HumanPlayer();
        Player p2 = new HumanPlayer();
        Tile tile = new Tile(0, 0, TileType.PLAINS);
        Unit unit = new Unit(1, 0.1, 5, 20, tile, "name", p1);
        Unit unit2 = new Unit(1, 0.1, 5, 20, tile, "name", p2);
        unit.Attack(unit2);
        assertEquals(16, unit2.getHP(), 0.1);
    }

    @Test
    public void TestAttackWhereOpponentDies() {
        Player p1 = new HumanPlayer();
        Player p2 = new HumanPlayer();
        Tile tile = new Tile(0, 0, TileType.PLAINS);
        Unit unit = new Unit(1, 0.1, 50, 20, tile, "name", p1);
        Unit unit2 = new Unit(1, 0.1, 5, 20, tile, "name", p2);
        p2.addUnit(unit2);
        assertEquals(1, p2.getArmy().getUnits().size());
        unit.Attack(unit2);
        assertEquals(0, p2.getArmy().getUnits().size());
    }

}

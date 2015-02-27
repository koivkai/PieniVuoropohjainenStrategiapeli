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
        Tile tile2 = new Tile(0, 0, TileType.FOREST);
        Tile tile3 = new Tile(0, 0, TileType.MOUNTAINS);
        Tile tile4 = new Tile(0, 0, TileType.ROADDOWNTOLEFT);
        Tile tile5 = new Tile(0, 0, TileType.OUTPOSTNEUTRAL);

        assertEquals(tile.getDefence(), 0.1, 0.01);
        assertEquals(tile2.getDefence(), 0.2, 0.01);
        assertEquals(tile3.getDefence(), 0.3, 0.01);
        assertEquals(tile4.getDefence(), 0, 0.01);
        assertEquals(tile5.getDefence(), 0.3, 0.01);

    }

}

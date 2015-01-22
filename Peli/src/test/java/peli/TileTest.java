/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peli;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import peli.*;

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
        Tile plains = new Tile(0, 0, TileType.PLAINS);
        double d = plains.getDefence();
        int m = plains.getMovement();
        assertEquals(0, d);
        assertEquals(m, 1);

    }

    

    
    }

    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import peli.MainTest;
import peli.TileTest;
import peli.TileTypeTest;
import peli.UnitTest;

/**
 *
 * @author Kaius
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TileTypeTest.class, MainTest.class, peli.PlayerTest.class, UnitTest.class, peli.ArmyTest.class, peli.BuildingTest.class, TileTest.class, peli.HumanPlayerTest.class})
public class PeliSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}

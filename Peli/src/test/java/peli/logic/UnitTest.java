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

    /**
     * Test of Attack method, of class Unit.
     */
    @Test
    public void testAttack() {
        System.out.println("Attack");
        Unit unit = null;
        Unit instance = null;
        instance.Attack(unit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Move method, of class Unit.
     */
    @Test
    public void testMove() {
        System.out.println("Move");
        Unit instance = null;
        instance.Move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Capture method, of class Unit.
     */
    @Test
    public void testCapture() {
        System.out.println("Capture");
        Building building = null;
        Unit instance = null;
        instance.Capture(building);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefence method, of class Unit.
     */
    @Test
    public void testGetDefence() {
        System.out.println("getDefence");
        Unit instance = null;
        double expResult = 0.0;
        double result = instance.getDefence();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTile method, of class Unit.
     */
    @Test
    public void testGetTile() {
        System.out.println("getTile");
        Unit instance = null;
        Tile expResult = null;
        Tile result = instance.getTile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TakeDamage method, of class Unit.
     */
    @Test
    public void testTakeDamage() {
        System.out.println("TakeDamage");
        double damage = 0.0;
        Unit instance = null;
        instance.TakeDamage(damage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Die method, of class Unit.
     */
    @Test
    public void testDie() {
        System.out.println("Die");
        Unit instance = null;
        instance.Die();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHP method, of class Unit.
     */
    @Test
    public void testGetHP() {
        System.out.println("getHP");
        Unit instance = null;
        double expResult = 0.0;
        double result = instance.getHP();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

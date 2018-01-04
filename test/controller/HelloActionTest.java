/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import models.SanPham;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lampstudio
 */
public class HelloActionTest {
    
    public HelloActionTest() {
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
     * Test of getDsSP method, of class HelloAction.
     */
    @Test
    public void testGetDsSP() {
        System.out.println("getDsSP");
        HelloAction instance = new HelloAction();
        List<SanPham> expResult = null;
        List<SanPham> result = instance.getDsSP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDsSP method, of class HelloAction.
     */
    @Test
    public void testSetDsSP() {
        System.out.println("setDsSP");
        List<SanPham> dsSP = null;
        HelloAction instance = new HelloAction();
        instance.setDsSP(dsSP);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoTen method, of class HelloAction.
     */
    @Test
    public void testGetHoTen() {
        System.out.println("getHoTen");
        HelloAction instance = new HelloAction();
        String expResult = "";
        String result = instance.getHoTen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoTen method, of class HelloAction.
     */
    @Test
    public void testSetHoTen() {
        System.out.println("setHoTen");
        String hoTen = "";
        HelloAction instance = new HelloAction();
        instance.setHoTen(hoTen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSanPham method, of class HelloAction.
     */
    @Test
    public void testGetSanPham() {
        System.out.println("getSanPham");
        HelloAction instance = new HelloAction();
        SanPham expResult = null;
        SanPham result = instance.getSanPham();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSanPham method, of class HelloAction.
     */
    @Test
    public void testSetSanPham() {
        System.out.println("setSanPham");
        SanPham sanPham = null;
        HelloAction instance = new HelloAction();
        instance.setSanPham(sanPham);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class HelloAction.
     */
    @Test
    public void testExecute() throws Exception {
        System.out.println("execute");
        HelloAction instance = new HelloAction();
        String expResult = "";
        String result = instance.execute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hienThi method, of class HelloAction.
     */
    @Test
    public void testHienThi() {
        System.out.println("hienThi");
        HelloAction instance = new HelloAction();
        String expResult = "";
        String result = instance.hienThi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

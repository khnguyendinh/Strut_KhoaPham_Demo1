/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import models.TaiKhoan;
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
public class DangKyActionSupportTest {
    
    public DangKyActionSupportTest() {
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
     * Test of getTaiKhoan method, of class DangKyActionSupport.
     */
    @Test
    public void testGetTaiKhoan() {
        System.out.println("getTaiKhoan");
        DangKyActionSupport instance = new DangKyActionSupport();
        TaiKhoan expResult = null;
        TaiKhoan result = instance.getTaiKhoan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaiKhoan method, of class DangKyActionSupport.
     */
    @Test
    public void testSetTaiKhoan() {
        System.out.println("setTaiKhoan");
        TaiKhoan taiKhoan = null;
        DangKyActionSupport instance = new DangKyActionSupport();
        instance.setTaiKhoan(taiKhoan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class DangKyActionSupport.
     */
    @Test
    public void testExecute() throws Exception {
        System.out.println("execute");
        DangKyActionSupport instance = new DangKyActionSupport();
        String expResult = "";
        String result = instance.execute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

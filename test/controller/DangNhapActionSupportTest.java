/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
public class DangNhapActionSupportTest {
    
    public DangNhapActionSupportTest() {
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
     * Test of isIsLoginSuccess method, of class DangNhapActionSupport.
     */
    @Test
    public void testIsIsLoginSuccess() {
        System.out.println("isIsLoginSuccess");
        DangNhapActionSupport instance = new DangNhapActionSupport();
        boolean expResult = false;
        boolean result = instance.isIsLoginSuccess();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsLoginSuccess method, of class DangNhapActionSupport.
     */
    @Test
    public void testSetIsLoginSuccess() {
        System.out.println("setIsLoginSuccess");
        boolean isLoginSuccess = false;
        DangNhapActionSupport instance = new DangNhapActionSupport();
        instance.setIsLoginSuccess(isLoginSuccess);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class DangNhapActionSupport.
     */
    @Test
    public void testExecute() throws Exception {
        System.out.println("execute");
        DangNhapActionSupport instance = new DangNhapActionSupport();
        instance.setPassword("123");
        instance.setUserName("khoa");
        String expResult = "success";
        String result = instance.execute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class DangNhapActionSupport.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        DangNhapActionSupport instance = new DangNhapActionSupport();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dangnhap method, of class DangNhapActionSupport.
     */
    @Test
    public void testDangnhap() {
        System.out.println("dangnhap");
        DangNhapActionSupport instance = new DangNhapActionSupport();
        String expResult = "";
        String result = instance.dangnhap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class DangNhapActionSupport.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        DangNhapActionSupport instance = new DangNhapActionSupport();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class DangNhapActionSupport.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        DangNhapActionSupport instance = new DangNhapActionSupport();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class DangNhapActionSupport.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        DangNhapActionSupport instance = new DangNhapActionSupport();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

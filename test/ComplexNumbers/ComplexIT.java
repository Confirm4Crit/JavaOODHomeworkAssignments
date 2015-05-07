/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComplexNumbers;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miles Robson
 */
public class ComplexIT
{

    public ComplexIT()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of toString method, of class Complex.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        Complex instance = new Complex(1, -1);
        String expResult = "1.0 - 1.0i";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Complex.
     */
    @Test
    public void testEquals()
    {
        System.out.println("equals true");
        Complex inputComplex = new Complex(1, 1);
        Complex instance = new Complex(1, 1);
        Boolean expResult = true;
        Boolean result = instance.equals(inputComplex);
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Complex.
     */
    @Test
    public void testAddTrue()
    {
        System.out.println("add true");
        Complex inputComplex = new Complex(2, 2);
        Complex instance = new Complex(5, 5);
        Complex expResult = new Complex(7, 7);
        Complex result = instance.add(inputComplex);
        Assert.assertTrue(expResult.equals(result));

        System.out.println("add false");
        inputComplex = new Complex(2, 2);
        instance = new Complex(5, 5);
        expResult = new Complex(7, 7);
        result = instance.add(inputComplex);
        Assert.assertTrue(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Complex.
     */
    @Test
    public void testAddFalse()
    {
        System.out.println("add false");
        Complex inputComplex = new Complex(2, 2);
        Complex instance = new Complex(3, 5);
        Complex expResult = new Complex(7, 7);
        Complex result = instance.add(inputComplex);
        Assert.assertFalse(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class Complex.
     */
    @Test
    public void testSubTrue()
    {
        System.out.println("sub");
        Complex inputComplex = new Complex(2, 2);
        Complex instance = new Complex(7, 7);
        Complex expResult = new Complex(5, 5);
        Complex result = instance.sub(inputComplex);
        Assert.assertTrue(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class Complex.
     */
    @Test
    public void testSubFalse()
    {
        System.out.println("sub");
        Complex inputComplex = new Complex(2, 2);
        Complex instance = new Complex(-7, -7);
        Complex expResult = new Complex(5, 5);
        Complex result = instance.sub(inputComplex);
        Assert.assertFalse(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of mult method, of class Complex.
     */
    @Test
    public void testMult()
    {
        System.out.println("mult");
        Complex inputComplex = new Complex(3, 2);
        Complex instance = new Complex(1, 7);
        Complex expResult = new Complex(-11, 23);
        Complex result = instance.mult(inputComplex);
        Assert.assertTrue(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of mult method, of class Complex.
     */
    @Test
    public void testMultFalse()
    {
        System.out.println("mult");
        Complex inputComplex = new Complex(3, 2);
        Complex instance = new Complex(1, 7);
        Complex expResult = new Complex(11, 23);
        Complex result = instance.mult(inputComplex);
        Assert.assertFalse(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class Complex.
     */
    @Test
    public void testDivTrue()
    {
        System.out.println("div");
        Complex inputComplex = new Complex(4, -5);
        Complex instance = new Complex(2, 3);
        Complex expResult;
        expResult = new Complex((float) (-0.17073171), (float) (0.5365854));
        Complex result = instance.div(inputComplex);
        Assert.assertTrue(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class Complex.
     */
    @Test
    public void testDivFalse()
    {
        System.out.println("div");
        Complex inputComplex = new Complex(4, -5);
        Complex instance = new Complex(5, 3);
        Complex expResult;
        expResult = new Complex((float) (-0.17073171), (float) (0.5365854));
        Complex result = instance.div(inputComplex);
        Assert.assertFalse(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
}

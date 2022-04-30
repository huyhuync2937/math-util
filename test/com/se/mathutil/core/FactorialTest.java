/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.se.mathutil.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class FactorialTest {

    @Test
    public void checkFactorialGivenRightArgumentReturnWell() {
        long expected = 120;
        long actual = MathUtil.getFactorial(5);

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));

    }
    
    @Test(expected = IllegalArgumentException.class)
    public void checkactorialGivenWrongArgumentThrowsException()
    {
        MathUtil.getFactorial(-5);
    }

    public FactorialTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

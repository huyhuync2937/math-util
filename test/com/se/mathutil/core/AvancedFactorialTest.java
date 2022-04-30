package com.se.mathutil.core;

import static com.se.mathutil.core.MathUtil.getFactorial;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author DELL
 */
@RunWith(value = Parameterized.class)
public class AvancedFactorialTest {

    @Parameters
    public static Object[][] initData() {
       return new Integer[][]
       {
           {0,1},{1,1},{2,2},{3,6},{4,24}
       };
    
    }
    
    @Parameter(value =0)
    public int n;
    @Parameter(value =1 )
    public long expected;
    
    @Test
    public void checkFatorialGivenRightArgumentReturnsWell()
    {
        Assert.assertEquals( expected, getFactorial(n));
    }
    
    
    
    
    

    public AvancedFactorialTest() {
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

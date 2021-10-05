package com.example.testingandroid

import org.junit.After
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before
import org.junit.Ignore
import java.lang.ArithmeticException

class MathUtilityTest {

    var utility: MathUtility? = null

    @Before                            // this will be executed before every test case
    fun initializeTest(){
        utility = MathUtility()
    }

    @After
    fun releaseTest(){
        utility = null
    }

    @Ignore                    // ignore test case and don't execute it
    @Test                            //means test class can be used
    fun testAdd(){
        //val utility = MathUtility()
        val actualSum =utility?.add(10,30)
        assertEquals("10+20 should be 40",40,actualSum)    //compares two
    }

    @Ignore
    @Test
    fun testSubtract(){
        //val utility = MathUtility()
        val subResult = utility?.subtract(12,45)
        assertEquals(-33,subResult)
    }

    @Ignore
    @Test
    fun testMultiply(){
        //val utility = MathUtility()
        val subResult = utility?.multiply(10,3)
        assertEquals(30,subResult)
    }

    @Ignore
    @Test
    fun testMultiplyWithZero(){
        //val utility = MathUtility()
        val subResult = utility?.multiply(10,0)
        assertEquals("multiplication with zero is always zero",0,subResult)
    }

    @Test
    fun testDivide(){
        assertNotNull(utility)
        val division = utility?.divide(10,2)
        assertEquals(5,division)
    }

    @Test (expected = ArithmeticException::class)
    fun testDivideByZero(){
        val division = utility?.divide(10,0)
    }


}
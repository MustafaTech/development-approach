package com.junit.tdd.TDDJUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StandardTests {

    @BeforeClass
    public static void initAll() {
    	System.out.println("***init All");
    }

    @Before
    public void init() {
    	System.out.println("init");
    }

    @Test(expected = RuntimeException.class)
    public void succeedingTest() {
    	System.out.println("succeedingTest");
    }

    @Test
    public void failingTest() {
        fail("a failing test");
    }

    @Test
    public void skippedTest() {
        // not executed
    }

    @Test
    public void abortedTest() {
       // assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    @After
    public void tearDown() {
    	System.out.println("tearDown after");
    }

    @AfterClass
    public static void tearDownAll() {
    	System.out.println("***after all");
    }

}
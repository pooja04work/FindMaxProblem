package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidateMax {
    CheckMax checkMax;

    @Before
    public void setUp() throws Exception {
        checkMax = new CheckMax();
    }

    @Test
    public void integerMaxAtFirstPositionTest() {
        int valueToCheck = checkMax.integerMax(55,33,4);
        Assert.assertEquals(55, valueToCheck);
    }

    @Test
    public void integerMaxAtSecondPositionTest() {
        int valueToCheck = checkMax.integerMax(22,33,4);
        Assert.assertEquals(33, valueToCheck);
    }

    @Test
    public void integerMaxAtThirdPositionTest() {
        int valueToCheck = checkMax.integerMax(2,33,49);
        Assert.assertEquals(49, valueToCheck);
    }

    @Test
    public void floatMaxAtFirstPositionTest() {
        float valueToCheck = checkMax.floatMax(7.6f,4.9f,4.0f);
        Assert.assertEquals(7.6f, valueToCheck, 0.0);
    }

    @Test
    public void floatMaxAtSecondPositionTest() {
        float valueToCheck = checkMax.floatMax(5.6f,8.9f,3.5f);
        Assert.assertEquals(8.9f, valueToCheck,Math.abs(8.9f - 8.9f));
    }

    @Test
    public void floatMaxAtThirdPositionTest() {
        float valueToCheck = checkMax.floatMax(5.9f,3.1f,9.0f);
        Assert.assertEquals(9.0f, valueToCheck, 0.0);
    }

    @Test
    public void stringMaxAtFirstPositionTest() {
        String valueToCheck = checkMax.stringMax("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", valueToCheck);
    }

    @Test
    public void stringMaxAtSecondPositionTest() {
        String valueToCheck = checkMax.stringMax("Apple", "Peach", "Bannana");
        Assert.assertEquals("Peach" , valueToCheck);
    }

    @Test
    public void stringMaxAtThirdPositionTest() {
        String valueToCheck = checkMax.stringMax("Apple", "Bannana", "Peach");
        Assert.assertEquals("Peach", valueToCheck);
    }



}

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


}

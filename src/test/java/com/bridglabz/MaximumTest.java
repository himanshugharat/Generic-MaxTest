package com.bridglabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void maximunNumber_Integer_ReturnMax() {
        Maximum maximum = new Maximum();
        int result = maximum.checkMaxInteger(new Integer[]{1, 3, 2});
        Assert.assertEquals(3, result);
    }

    @Test
    public void maximunNumber_Float_ReturnMax() {
        Maximum maximum = new Maximum();
        float result = maximum.checkMaxFloat(new Float[]{1.1f, 1.2f, 2.2f});
        Assert.assertEquals(2.2f, result, 0.0);
    }

    @Test
    public void maximunNumber_String_ReturnMax() {
        Maximum maximum = new Maximum();
        String result = maximum.checkMaxString(new String[]{"apple","banana","orange"});
        Assert.assertEquals("orange", result);
    }
}

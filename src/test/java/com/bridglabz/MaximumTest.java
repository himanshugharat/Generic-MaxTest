package com.bridglabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void maximunNumber_Integer_ReturnMax() {
        Maximum maximum = new Maximum<>(new Integer[]{1, 3, 2});
        int result = (int) maximum.checkMax();
        Assert.assertEquals(3, result);
    }

    @Test
    public void maximunNumber_Float_ReturnMax() {
        Maximum maximum = new Maximum(new Float[]{1.1f, 1.2f, 2.2f});
        Comparable result = maximum.checkMax();
        Assert.assertEquals(2.2f, (Float) result, 0.0);
    }

    @Test
    public void maximumNumber_String_ReturnMax() {
        Maximum maximum = new Maximum(new String[]{"apple", "banana", "orange"});
        Comparable result = maximum.checkMax();
        Assert.assertEquals("orange", result);
    }

    @Test
    public void maximumNumber_Integer_ReturnMax() {
        Maximum maximum=new Maximum(new Integer[]{1,2,3,4,5,6});
        Comparable result= maximum.printMax(6);
        Assert.assertEquals(6,result);

    }
}

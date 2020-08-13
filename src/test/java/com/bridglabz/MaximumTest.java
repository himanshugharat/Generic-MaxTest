package com.bridglabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void maximunNumber_AtFirstPlace_ReturnMax () {
        Maximum maximum=new Maximum();
        int result=maximum.checkMaxInteger(new Integer[]{1,3,2});
        Assert.assertEquals(3,result);
    }
}

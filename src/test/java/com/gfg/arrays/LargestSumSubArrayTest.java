package com.gfg.arrays;

import org.testng.annotations.Test;

import static org.fest.assertions.api.Assertions.assertThat;

@Test
public class LargestSumSubArrayTest {

    public void testCase1(){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        assertThat(LargestSumSubArray.largestSumSubarray(arr)).isEqualTo(7);
    }
}

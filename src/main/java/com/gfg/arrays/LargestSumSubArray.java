/*

5 3 5 -7 3 2
int max_sum, sum_till_here


*/
package com.gfg.arrays;

import java.util.*;
public class LargestSumSubArray {

    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	
    	int size=scanner.nextInt();
    	int[] arr = new int[size];

    	for(int i=0;i<size;i++){
    		arr[i] = scanner.nextInt();
    	}

    	System.out.println("");
    	System.out.println(largestSumSubarray(arr));
    }

    public static int largestSumSubarray(int[] arr){
    	int max_sum=0;
        int sum_till_here=0;

    	if(arr==null){
    		return max_sum;
    	}

        for(int arr_val: arr){
        	sum_till_here = sum_till_here+arr_val;
        	if(sum_till_here<0){
        		max_sum=0;
        		sum_till_here=0;
        		continue;
        	}
        
        	max_sum=sum_till_here>max_sum?sum_till_here:max_sum;
        }

        return max_sum;
    }


}

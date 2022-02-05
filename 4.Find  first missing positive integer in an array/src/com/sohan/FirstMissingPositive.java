package com.sohan;

import java.util.Scanner;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {

        // create an array of size equal to nums length
        int len = nums.length;
        boolean isPresent [] = new boolean[len + 1];
        // iterate through the elements in the array.
        for (int n : nums){
            // ignore the numbers which is less than an equal and greater then n;
            // when an element then its changed to true in the array for index.
            if (n >= 0 && n <= len)
                isPresent[n] = true;
        }
        // iterate through the boolean array
        for ( int i =1; i < isPresent.length; i++){
            // when its false return the index;
            if(! isPresent[i])
                return i;
        }
        return len + 1;
        // if the element are sorted then the missing
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; ++i) {
            nums[i] = in.nextInt();
        }
        int result = new FirstMissingPositive().firstMissingPositive(nums);
        System.out.println(result);
    }
}
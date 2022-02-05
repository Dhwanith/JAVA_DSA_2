package com.sohan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiggleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        List<Integer>ans = wiggleSort(n,nums);
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
    static void swap (List<Integer> nums, int i , int j){
        // initialise a temp variable with i value
        int temp = nums.get(i);
        // overwrite the i index value with j
        nums.set(i , nums.get(j));
        // overwrite the j index value with temp
        nums.set(j , temp);
    }


    static List<Integer> wiggleSort(int n, List<Integer>nums){
        // iterate the loop for the n numbers.
        for (int i = 0; i < n -1; i++){
            // initialise 2 variables one as current  and the other as next.
            int current = nums.get(i);
            int next = nums.get(i + 1);
            // if the index is even and current is greater then next
            if (((i %2 == 0) && (current > next ) || (i%2 != 0) && (current < next)))
                swap(nums , i , i+1);
               //swap the elements in the 2 indexes.
               // if the index is odd and current is smaller then next
               // swap the elements

        }
        // return the list
        return nums;


    }
}
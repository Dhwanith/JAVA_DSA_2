package com.sohan;

import java.util.Scanner;

public class EqualPartition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

        int res = equalPartition(n, arr);

        System.out.println(res);

    }

    static int equalPartition(int n, long arr[]) {

        // initialise an array of size n;
        long prefix [] = new long[n];
        // iterate through the element of an array
        long leftSum = 0;
        for(int i =0; i < n; i++){
            prefix[i] = arr[i] + leftSum;
            leftSum = prefix[i];
        }
        // store the prefix value in the array
        // initialise the left sum to zero
        // iterate through the elements of prefix array.
        leftSum = 0;
        for (int i =0; i < n; i++){
            long rightSum = prefix[n -1 ] - prefix[i];
            if (i != 0)
            leftSum = prefix[i - 1];
            if(leftSum == rightSum)
                return i;
        }
        return -1;
        // compute the right sum by subtracting the last prefix value - the current prefix value
        // if the left sum is then return the index
        // if not found return -1


    }
}
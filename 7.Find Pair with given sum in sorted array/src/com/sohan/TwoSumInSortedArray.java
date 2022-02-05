package com.sohan;

import java.util.Scanner;

public class TwoSumInSortedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        boolean res = twoSumInSortedArray(n, arr, k);

        String ans = (res) ? "Present" : "Not Present";

        System.out.println(ans);

    }

    static boolean twoSumInSortedArray(int n, int arr[], int k) {

        // initialise two pointer
        // one pointer at the start of the array = i
        int i = 0;
        // other pointer at the end of the array = j
        int j = n - 1;

        while (i < j){
            // compute the sum of the element at two pointer.
            int sum = arr[i] + arr[j];
            // if the sum is found then return true
            if (sum == k)
                return true;
            // if the sum is larger than the target discard a larger element thus decrement the J
            else if (sum > k){
                j--;
            }else {
                i++;
                // else if the sum is smaller . discard a smaller element thus increment
                // continue the search till both the pointers meet or crossover
            }
        }
        return false;
    }
}
package com.sohan;

import java.util.Arrays;
import java.util.Scanner;

public class NumSort {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String arr[] = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        String sortedArray[] = numSort(n, arr);

        for (String num : sortedArray) {
            System.out.print(num + " ");
        }

    }

    static String[] numSort(int n, String[] arr) {

        // call the arrays sort functions
        Arrays.sort(arr, (left , right)->
        {
            if(left.length() != right.length())
                return left.length() - right.length();
            return left.compareTo(right);
        });
        // modify the inbuilt comparator
        // if the length of to strings aren't equal
        // subtract the first string from the second one
        // else if the lengths are equal use of tradition compareTo method and return the value.
        return arr;

    }
}

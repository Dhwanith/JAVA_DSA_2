package com.sohan;

import java.util.Arrays;
import java.util.Scanner;

public class MinDiff {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int res = minDiff(n, a);

        System.out.println(res);

    }
    static int minDiff(int n, int a[]) {
        // sort the array
        Arrays.sort(a);
        // initialise the min variable
        int min = Integer.MAX_VALUE;
        // iterate through the elements of the array
        for (int i = 0; i < n - 1; i++){
            int diff = a[i+1] - a[i];
            if(diff < min)
                min = diff;
        }
        // find the difference between current and the next element
        // if the difference is smaller than the min
        // rewrite the min
        // return the min
        return min;

    }
}


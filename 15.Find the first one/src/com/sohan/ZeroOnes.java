package com.sohan;

import java.util.Scanner;

public class ZeroOnes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int res = zeroOnes(n, a);
        System.out.println(res);

    }

    static int zeroOnes(int n, int a[]) {
        // initialise the low to the zero
        int low = 0;
        // initialise the high to n - 1
        int high = n - 1;
        // run the loop while low <= high
        while(low <= high){
            // calculate the mid from low and high
            int mid = low + (high - low)/2;
            // check if the mid-element is 1 and check if the mid-index  is 0 or prev element i 0
            if(a[mid] == 1 && (mid == 0 || a[mid-1] == 0 ))
                return mid;
            // return the index
            // else if the current element is 1 and make the high as mid -1
            else if (a[mid] == 1)
                high = mid - 1;
            // else make the low as mid +1
            else
                low = mid + 1;
        }
        // return -1
        return -1;
    }
}

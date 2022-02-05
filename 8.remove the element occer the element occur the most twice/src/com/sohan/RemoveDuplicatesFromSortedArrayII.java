package com.sohan;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int res = removeDuplicatesFromSortedArrayII(n, arr);
        System.out.println(res);
        for (int i = 0; i < res; i++)
            System.out.print(arr[i] + " ");
    }
    static int removeDuplicatesFromSortedArrayII(int n, int[] arr) {
        // initialise the count variable
        int count = 1;
        // initialise a index pointer with 1.
        int index = 1;
        // iterate the array from 1 to n
        for(int i = 1; i < n; i++){
            // if the current element is equal to prev element increment count

            if(arr[i] == arr[i - 1]) count++;
            else count = 1;
            // else rest of the counter to 1
            // if the count is less than or equal to 2. then copy the element to the pointer and increment the index
            if(count <= 2) arr[index++] = arr[i];
        }
        return index;
    }
}
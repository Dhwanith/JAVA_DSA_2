package com.sohan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortArrayAbsolute {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        SortArrayAbsolute s = new SortArrayAbsolute();

        int res[] = s.sortArrayAbsolute(n, arr);

        for (int j : res)
            System.out.print(j + " ");
    }
    public static class CustomComparator implements Comparator <Integer> {
        @Override
        public int compare(Integer a , Integer b){
            // compare the absolute value of a and b
            if (Math.abs(a) < Math.abs(b))
                return -1;
            else if (Math.abs(a) > Math.abs(b))
                return 1;
            else if (a < b)
                return -1;
            else if (a > b)
                return 1;
            else
                return 0;
            // if a < b return -1
            // else if a == b return 1
              // if a < b
              // return -1
              // if a > b
              // if a == b
              // return 0
        }

    }


    static int[] sortArrayAbsolute(int n, int arr[]) {
        //initialise an integer array
        Integer i [] = new Integer[n];
        // copy the elements from int to integer .
        for (int j =0; j < n; j++){
            i[j] = new Integer(arr[j] );
        }
        // call the arrays sort with custom comparator function
        Arrays.sort(i , new CustomComparator());
        // copy the elements from integer array to int array
        for (int j = 0; j < n; j++){
            arr[j] = i [j];
        }
        // return the int array.
        return arr;

    }
}
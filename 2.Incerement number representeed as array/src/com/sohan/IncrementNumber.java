package com.sohan;

import java.util.Scanner;

public class IncrementNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        int incArr[] = incrementNumber(n, arr);

        for(int i=0;i<incArr.length;i++) {
            System.out.print(incArr[i]);
        }

    }

    static int[] incrementNumber(int n, int arr[]){
        // iterate through the digits of the number = array.
        for (int i = arr.length - 1 ; i >= 0; i--){
            if (arr[i] < 9 ){
                // increment one to that
                arr[i]++;
                // if the summed digit is less tan  9. return array
                return arr;
            }else
                arr[i] = 0;
            // else continue and increment the other digit
        }
        // if we reach the end of the loop. then create an array sey it to appropriate value and return.
        int result [] = new int [ n +1];
        result[0] = 1;
        return result;

    }
}
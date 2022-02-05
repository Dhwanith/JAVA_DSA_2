package com.sohan;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class SubarraySumZero {
    public static String subarraySumZero(Vector<Integer> arr)
    {
        Set<Integer> hash_set = new HashSet<Integer>();
        int sum =0;
        for(int i =0; i < arr.size(); i++){
            sum+= arr.get(i);
            if(arr.get(i)==0 || sum == 0|| hash_set.contains(sum))
                return "Yes";
            hash_set.add(sum);
        }
        return "No";
//        String result;
//        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            Vector<Integer> arr=new Vector<Integer>();
            for(int i=0;i<n;i++)
            {
                arr.add(sc.nextInt());
            }
            System.out.println(subarraySumZero(arr));
        }

    }
}


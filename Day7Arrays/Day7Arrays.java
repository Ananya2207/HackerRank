/*
Objective
Today, we're learning about the Array data structure. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given an array, , of  integers, print 's elements in reverse order as a single line of space-separated numbers.

Input Format

The first line contains an integer,  (the size of our array).
The second line contains  space-separated integers describing array 's elements.

Constraints

, where  is the  integer in the array.
Output Format

Print the elements of array  in reverse order as a single line of space-separated numbers.
*/
//package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day7Arrays {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        scanner.close();
    }
}

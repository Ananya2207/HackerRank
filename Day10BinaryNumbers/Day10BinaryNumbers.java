/*
Objective
Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.

Input Format

A single integer, .

Constraints

Output Format

Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of .
*/
//package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10BinaryNumbers {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        ArrayList a=new ArrayList();
        while(n>0)
        {
            int rem=n%2;
            n=n/2;
            a.add(rem);
        }
        //System.out.println(a);
        int count=0;
        int max=0;
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i).equals(1))
            {
                count++;
            }
            else
            {
                count=0;
            }
            if(count>max)
            {
                max=count;
            }
        }
        System.out.println(max);
        scanner.close();
    }
}

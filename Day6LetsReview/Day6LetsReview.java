/*
Objective
Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

Note:  is considered to be an even index.

Input Format

The first line contains an integer,  (the number of test cases).
Each line  of the  subsequent lines contain a String, .

Constraints

Output Format

For each String  (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters
*/
//package hackerrank;

import java.io.*;
import java.util.*;

public class Day6LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        2
//Hacker
//Rank
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=in.next();
        }
        for(int i=0;i<n;i++)
        {
            //s[i]=in.next();
            for(int j=0;j<s[i].length();j++)
            {
                if(j%2==0)
                {
                    System.out.print(s[i].charAt(j));    
                }
                
            }
            System.out.print(" ");
            for(int j=0;j<s[i].length();j++)
            {
                if(j%2!=0)
                {
                    System.out.print(s[i].charAt(j));    
                }
                
            }
            System.out.println("");
        }
        
    }
}

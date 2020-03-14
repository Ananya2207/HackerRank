package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day20Sorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int countnumswaps=0;
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    countnumswaps++;
                }
            }
            if(countnumswaps==0)
                break;
        }
        System.out.println("Array is sorted in "+countnumswaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
        // Write Your Code Here
    }
}

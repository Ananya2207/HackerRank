/*
Given a sequence of  integers,  where each element is distinct and satisfies . For each  where , find any integer  such that  and print the value of  on a new line.

For example, assume the sequence . Each value of  between  and , the length of the sequence, is analyzed as follows:

, so 
, so 
, so 
, so 
, so 
The values for  are .

Function Description

Complete the permutationEquation function in the editor below. It should return an array of integers that represent the values of .

permutationEquation has the following parameter(s):

p: an array of integers
Input Format

The first line contains an integer , the number of elements in the sequence.
The second line contains  space-separated integers  where .

Constraints

, where .
Each element in the sequence is distinct.
Output Format

For each  from  to , print an integer denoting any valid  satisfying the equation  on a new line.
*/

//package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SequenceEquation {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int result[]=new int[p.length];
        for(int i=1;i<=p.length;i++)
        {//System.out.println("i="+i);
            for(int j=0;j<p.length;j++)
            {
                if(i==p[j])
                {
                    //System.out.println("j="+(j+1));
                    for(int q=0;q<p.length;q++)
                    {
                        if(j+1==p[q])
                        {//System.out.println("q="+(q+1));
                            result[i-1]=q+1;
                        }
                    }
                }
            }
        }
        
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        for (int i = 0; i < result.length; i++) {
            //bufferedWriter.write(String.valueOf(result[i]));
            System.out.println(result[i]);
            
        }

       // bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

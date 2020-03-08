/*
Given an array of integers, find and print the maximum number of integers you can select from the array such that the absolute difference between any two of the chosen integers is less than or equal to . For example, if your array is , you can create two subarrays meeting the criterion:  and . The maximum length subarray has  elements.

Function Description

Complete the pickingNumbers function in the editor below. It should return an integer that represents the length of the longest array that can be created.

pickingNumbers has the following parameter(s):

a: an array of integers
Input Format

The first line contains a single integer , the size of the array .
The second line contains  space-separated integers .

Constraints

The answer will be .
Output Format

A single integer denoting the maximum number of integers you can choose from the array such that the absolute difference between any two of the chosen integers is .
*/
package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result11 {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
    int count1=0;
    int count2=0;
    
    int total=0;
    for(int i=0;i<a.size();i++)
    {count1=0;
    count2=0;
        for(int j=i;j<a.size();j++)
        {
            
            if(Math.abs(a.get(i)-a.get(j))<=1)
            {
                if(a.get(i)==a.get(j))
                {
                count1++;
                count2++;
              //      System.out.println("Inside ==");
                }
                if(a.get(i)==a.get(j)-1)
                {
                    count1++;
            //        System.out.println("Inside 5");
                }
                if(a.get(i)==a.get(j)+1)
                {
                    count2++;
          //          System.out.println("Inside 3");
                }

//System.out.println(count);
            }
        }
        //System.out.println("count1 "+count1);
        //System.out.println("count2 "+count2);
        
        //System.out.println("Outside");
        if(count1>total || count2>total)
        {
        if(count1>=count2)
        {//System.out.println("Inside");
        total=count1; 
        }
        else
        {
            total=count2;
        }
        }
    }
    
    
    return total;
    }

}

public class PickingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result11.pickingNumbers(a);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

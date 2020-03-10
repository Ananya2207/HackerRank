/*
The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after  growth cycles?

For example, if the number of growth cycles is , the calculations are as follows:

Period  Height
0          1
1          2
2          3
3          6
4          7
5          14
Function Description

Complete the utopianTree function in the editor below. It should return the integer height of the tree after the input number of growth cycles.

utopianTree has the following parameter(s):

n: an integer, the number of growth cycles to simulate
Input Format

The first line contains an integer, , the number of test cases.
 subsequent lines each contain an integer, , denoting the number of cycles for that test case.

Constraints



Output Format

For each test case, print the height of the Utopian Tree after  cycles. Each height must be printed on a new line.
*/
//package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class UtopianTree {

    // Complete the utopianTree function below.
  //  3
//0
//1
//4
    static int utopianTree(int n) {
//        if(n==0)
//        {
//            return 1;
//        }
        int x=1;
           for(int i=1;i<=n;i++)
           {
               if(i%2==0)
               {
                    x=x+1;
               }
               else
               {
                 x=2*x; 
               }
               if(i==n)
               {
                   return x;
               }
           }
        return 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);
            System.out.println(result);
            //bufferedWriter.write(String.valueOf(result));
           // bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}

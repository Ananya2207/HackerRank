///package hackerrank1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumDistances {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
        int count =99999;
        int min=99999;
        int flag=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {//System.out.println("i , j "+i+" "+j+" a[i]"+a[i]);
                    flag=1;
                    count=j-i;
                    //System.out.println("count "+count);
                    break;
                }
            }
            if(count<min)
            {
                min=count;
            }
        }    
         if(flag==0)
         {
             return -1;
         }
         else{
             return min;
         }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

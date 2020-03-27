//package hackerrank1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ManasaStones {

    // Complete the stones function below.
    static Object[] stones(int n, int a, int b) {
        //int res[]=new int[10];
        ArrayList al=new ArrayList();
        int min=Math.min(a, b);
        int max=Math.max(a, b);
        if(a==b)
        {
            
                al.add(a*(n-1));
            
        }
        else
        {
            for(int i=min*(n-1);i<=max*(n-1);i=i+(max-min))
            {
                al.add(i);
            }
        }
        //System.out.println(al);
        Object res[]=al.toArray();
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int a = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int b = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            Object[] result = stones(n, a, b);

            for (int i = 0; i < result.length; i++) {
                //bufferedWriter.write(String.valueOf(result[i]));
                System.out.print(result[i]+" ");
                if (i != result.length - 1) {
                    //bufferedWriter.write(" ");
                }
                
            }
            System.out.println("");
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}

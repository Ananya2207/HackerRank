//package hackerrank1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FairRations {

    // Complete the fairRations function below.
    static int fairRations(int[] B) {
        int count=0;
        int count1=0;
        for(int i=0;i<B.length;i++)
        {
            if(B[i]%2==0)
            {
                
            }
            else
            {
               count++; 
            }
        }
        if(count%2!=0)
        {
            System.out.println("NO");
            return -1;
        }
        else{
            for(int i = 0; i<B.length; i++)
            {
                if(B[i] % 2 != 0)
                {
                    B[i] = B[i] + 1;
                    B[i+1] = B[i+1] + 1;
                    count1+=2;
                }
            }
          return count1;  
        }
        
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] B = new int[N];

        String[] BItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < N; i++) {
            int BItem = Integer.parseInt(BItems[i]);
            B[i] = BItem;
        }

        int result = fairRations(B);
        if(result!=-1)
        {
        System.out.println(result);
        }
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

//package hackerrank1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long count=0;
        if(s.length()>=n)
        {
            String r=s.substring(0,(int) n);
            for(int i=0;i<r.length();i++)
            {
                if(r.charAt(i)=='a')
                {
                    count++;
                }
            }
        }
        else
        {
            long repeat= (n/s.length());
            int rem=(int) (n%s.length());
           // System.out.println("repeat="+repeat+"rem="+rem);
            
            
                String r=s.substring(0,rem);
            //s.concat(r);
            //System.out.println("s="+s);
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='a')
                {
                    count++;
                }
            }
            count=count*repeat;
            for(int i=0;i<r.length();i++)
            {
                if(r.charAt(i)=='a')
                {
                    count++;
                }
            }
            
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

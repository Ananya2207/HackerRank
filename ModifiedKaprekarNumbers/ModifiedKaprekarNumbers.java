//package hackerrank1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ModifiedKaprekarNumbers {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(long p, long q) {
        int digit=0;
        int sq_digit=0;
        if(p<4)
        {
            p=4;
            System.out.print("1 ");
        }
        int flag=0;
        for(long i=p;i<=q;i++)
        {
            digit=0;
            sq_digit=0;
            for(long num=i;num!=0 ;num=num/10)
            {
                digit++;
                
            }
            long square=i*i;
            for(long num=square;num!=0 ;num=num/10)
            {
                sq_digit++;
                
            }
            String sq=String.valueOf(square);
            String r="";
            String l="";
            if(2*digit == sq_digit)
            {
                r=sq.substring(digit,sq_digit);
                l=sq.substring(0, digit);
            }
            else
            {
               r=sq.substring(digit-1,sq_digit);
               l=sq.substring(0, digit-1); 
            }
            
            //System.out.println(sq);
            //System.out.println(l);
            //System.out.println(r);
            long left=Integer.valueOf(l);
            long right=Integer.valueOf(r);
            if(i==left+right)
            {flag=1;
                System.out.print(i+" ");
            }
            //System.out.println("digits="+digit);
            //System.out.println("sq_digits="+sq_digit);
            
            
            
        }
        if(flag==0)
        {
            System.out.println("INVALID RANGE");  
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long p = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long q = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}


//package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulDaysAtTheMovies {

    // Complete the beautifulDays function below.20 23 6
    static int beautifulDays(int i, int j, int k) {
        int count=0;
        for(int q=i;q<=j;q++)
        {
            int rev=0;
            int rem=0;
            for(int x=q;x!=0;x=x/10)
            {
            rem=x%10;
            
            rev=rev*10+rem;
            }
            //System.out.println("q="+q+"rev="+rev);
             if(Math.abs(q-rev)%k==0)
             {
                 count++;
             }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

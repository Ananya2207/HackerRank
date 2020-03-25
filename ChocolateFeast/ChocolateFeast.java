//package hackerrank1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ChocolateFeast {

    // Complete the chocolateFeast function below.
    static int chocolateFeast(int n, int c, int m) {
        int count=0;
        int wrapper=0;
        count=n/c;
        wrapper=n/c;
//        for(int i=n;i>=c ;i=i-c)
//        {
//            count++;
//            //System.out.println("i=="+i);
//            wrapper++;
//        }
        //System.out.println("wrapper count ="+wrapper);
        
//        for(int i=wrapper;i>=m;)
//        {
//            if(i==m)
//            {
//                count++;
//                break;
//            }
//            else{
//            i=wrapper-m;
//            count++;
//            i++;
//            //System.out.println("i="+i);
//            }
//        }
//System.out.println("count "+count);
        while(wrapper>=m){
            if(wrapper==m)
            {
                count++;
                break;
            }
            else{
            //System.out.println("wrapper ="+wrapper);  
        count=count+wrapper/m;
        wrapper=wrapper/m + wrapper%m;
            //System.out.println("wrapper ="+wrapper);
            //wrapper++;
                //System.out.println("wrapper "+wrapper);
                //System.out.println("count "+count);
            }
        }
        //System.out.println("count "+count);
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] ncm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(ncm[0]);

            int c = Integer.parseInt(ncm[1]);

            int m = Integer.parseInt(ncm[2]);

            int result = chocolateFeast(n, c, m);
            System.out.println(result);
            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}
//1
//7045 25 6484
//1
//2216 8 35
//200
//16809 123 11668

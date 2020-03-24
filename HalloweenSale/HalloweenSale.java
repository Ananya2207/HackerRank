//package hackerrank1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HalloweenSale {

    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int total=0;
        int count=0;
        
        for(int i=p; total<s ;)
        {
            if(i>=m){
            total=total+i;
            if(total>s)
            {
                break;
            }
            //System.out.println("total ="+total+"i "+i);
            count++;
            //System.out.println("count ="+count);
            i=i-d;
            }
            else
            {//System.out.println("else");
                total=total+m;
                if(total>s)
                {
                break;
                }
                count++;
                
                //System.out.println("total ="+total);
                //System.out.println("count ="+count);
            }
        }
        
        
        //System.out.println("count= "+count);
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] pdms = scanner.nextLine().split(" ");

        int p = Integer.parseInt(pdms[0]);

        int d = Integer.parseInt(pdms[1]);

        int m = Integer.parseInt(pdms[2]);

        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        //bufferedWriter.write(String.valueOf(answer));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

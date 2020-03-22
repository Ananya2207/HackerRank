//package hackerrank1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ACMICPCTeam {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
        int count=0;
        int total=0;
        int max=0;
        int result[]=new int[2];
        for(int i=0;i<topic.length;i++)
        {
            for(int j=i+1;j<topic.length;j++)
            {count=0;
                for(int q=0;q<topic[0].length();q++)
                {
                    if(topic[i].charAt(q)=='1' || topic[j].charAt(q)=='1' )
                    {
                        count++;
                    }
                }
                //System.out.println((i+1)+" "+(j+1)+" count="+count);
                if(count>max)
                {
                    max=count;
                }
//                if(count==topic[0].length())
//                {
//                    total++;
//                }
            }
        }
        
        
        for(int i=0;i<topic.length;i++)
        {
            for(int j=i+1;j<topic.length;j++)
            {count=0;
                for(int q=0;q<topic[0].length();q++)
                {
                    if(topic[i].charAt(q)=='1' || topic[j].charAt(q)=='1' )
                    {
                        count++;
                    }
                }
                if(count==max)
                {
                    total++;
                }
            }
        }
        
        
        //System.out.println("total="+total);
        result[0]=max;
        result[1]=total;
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            //bufferedWriter.write(String.valueOf(result[i]));
            System.out.println(result[i]);
            if (i != result.length - 1) {
                //bufferedWriter.write("\n");
            }
        }

        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

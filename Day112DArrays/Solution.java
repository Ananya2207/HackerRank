import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
         int sum=0;
    int sum1[]=new int[16];
    int q=0;
         //  int max=sum;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
            for(int k=i;k<i+3;k++)
            {
                for(int p=j;p<j+3;p++)
                {
                    if(k==i+1)
                    {
                        if(p==j || p==j+2)
                        {
                            continue;
                        }
                    }
                    sum=sum+arr[k][p];
                    
//                    if(k-p==1)
//                    {
//                        sum=sum-arr[k][p];
//                    }
//                    if(p-k==1)
//                    {
//                        sum=sum-arr[k][p];
//                    }
                }
            }   
            //System.out.println("sum ="+sum);
                //  sum=0; 
            
            
            sum1[q++]=sum;
            
            
//            if(sum>max)
//                max=sum;
            
            
            sum=0;
            }
        }
    int max=sum1[0];
    
        for(int i=0;i<16;i++)
        {
            if(sum1[i]>max)
                max=sum1[i];
            //System.out.println(sum1[i]);
        }
//        int max=sum[0][0];
//        for(int i=0;i<4;i++)
//        {
//            for(int j=0;j<4;j++)
//            {
//                if(sum[i][j]>max)
//                {
//                    max=sum[i][j];
//                }
//            }
//        }
        System.out.println(max);

        scanner.close();
    }
}

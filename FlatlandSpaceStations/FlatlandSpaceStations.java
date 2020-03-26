//package hackerrank1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FlatlandSpaceStations {

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        int flag[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                if(i==c[j])
                {//System.out.println("i="+i);
                    flag[i]=1;
                }
            }
        }
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(flag[i]+" ");
//        }
        //System.out.println("");
        int max=0;
        int dis=0;
        int last=0;
        int left=0;
        int right=0;
        int flag1=0;
        int flag2=0;
        for(int i=0;i<n;i++)
        {   
            dis=0;
            flag2=0;
            if(flag[i]==1)
            {
                dis=0;
                last=i;
                flag1=1;
            }
            else{
                left=i-last;
                
                
                for(int j=i+1;j<n;j++)
                {
                    //System.out.println("inside");
                    if(flag[j]==1)
                    {flag2=1;
                        //System.out.print("j="+j);
                        right=j-i;
                        break;
                    }
                }
                if(flag2==0)
                {
                    right=left;
                }
               //System.out.println("left ="+left+"right +"+right);
                
                
                if(left<=right && flag1==1)
                {
                    dis=left;
                }
                else
                {flag1=1;
                    dis=right;
                }
                  
            }
            //System.out.println("max distance ="+dis);
            if(dis>max)
            {
                max=dis;
            }
            
        }
        
        
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

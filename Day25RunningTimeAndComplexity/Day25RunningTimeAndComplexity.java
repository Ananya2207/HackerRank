//package hackerrank1;

import java.io.*;
import java.util.*;

public class Day25RunningTimeAndComplexity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        int n[]=new int[t];
        for(int i=0;i<t;i++)
        {
            n[i]=in.nextInt();
        }
        
        int flag=0;
        for(int i=0;i<t;i++)
        {   flag=0;
            if(n[i]==1)
            {
                System.out.println("Not prime");
                continue;
            }
            for(int j=2;j<(n[i]/2)+1;j++)
            {
                if(n[i]%j==0)
                {   flag=1;
                    System.out.println("Not prime");
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("Prime");
            }
            
        }

    }
}

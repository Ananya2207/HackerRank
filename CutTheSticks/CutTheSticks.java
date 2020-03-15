
//package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CutTheSticks {

    // Complete the cutTheSticks function below.
    static Object[] cutTheSticks(int[] arr) {
        //int result[]=new int[arr.length];
        int min=99999;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        ArrayList al=new ArrayList();
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
        //System.out.println("");
        int count=0;
          for(int i=0;i<arr.length;i++)
          {count=0;
              if(arr[i]!=0){
                  int a=arr[i];
              for(int j=0;j<arr.length;j++)
              {
                  if(arr[j]!=0){
                  arr[j]=arr[j]-a;
                  count++;
                  }
                  //System.out.print(arr[j]+" ");
              }
              }
              else{continue;}
             /// System.out.println("");
          //result[i]=count;
          al.add(count);
          }
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]);
//        }        
        //System.out.println(al);
        Object result1[]=al.toArray();
        //System.out.println("");
        return result1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        Object[] result = cutTheSticks(arr);

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

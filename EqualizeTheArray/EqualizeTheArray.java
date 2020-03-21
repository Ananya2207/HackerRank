//package hackerrank1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class EqualizeTheArray {

    // Complete the equalizeArray function below.
    static int equalizeArray(List<Integer> al) {
        Collections.sort(al);
        //System.out.println(al);
        HashSet hs=new HashSet();
        for(int i=0;i<al.size();i++)
        {
            hs.add(al.get(i));
        }
        Object ele[]= hs.toArray();
        int fre[]=new int[ele.length];
        for(int i=0;i<ele.length;i++)
        {
            fre[i]=Collections.frequency(al, ele[i]);
        }
        int max=0;
        for(int i=0;i<ele.length;i++)
        {
            if(fre[i]>max)
                max=fre[i];
        }
        //System.out.println(hs);
        return al.size()-max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
       
        int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //int[] arr = new int[n];
        ArrayList<Integer> al=new ArrayList<Integer> ();
        
        //String[] arrItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }
        for(int i=0;i<n;i++)
        {
            al.add(scanner.nextInt());
        }
        
        int result = equalizeArray(al);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

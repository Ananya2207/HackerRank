//package hackerrank1;
import java.io.*;
import java.util.*;

public class LisasWorkbook {

    // Complete the workbook function below.
    static int workbook(int n, int k, int[] arr) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        
        int problems=0;
        int count=0;
        int qno=0;
        for(int i=0;i<n;i++)
        {   
            problems=arr[i];
            //System.out.println("problems "+problems);
            qno=0;
            int u=(problems/k)+1;
            int v=problems/k;
            int t=0;
            if(problems%k==0)
            {
               t=v; 
            }
            else
            {
               t=u; 
            }
            for(int p=0;p<t;p++)
            {   
                ArrayList a=new ArrayList();
                for(int q=0;q<k;q++)
                {qno++;
                 a.add(qno);
                 if(qno==problems)
                 {
                     break;
                 }
                }
                al.add(a);
            }
            
           // System.out.println(al);
            
            //al.add(a);
        }
        int total=0;
        for(int i=0;i<al.size();i++)
        {
            for(int j=0;j<al.get(i).size();j++)
            {
                //System.out.print(al.get(i).get(j));
                if(al.get(i).get(j)==i+1)
                {
                  total++;  
                }
            }
            //System.out.println("");
        }
        
        
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = workbook(n, k, arr);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

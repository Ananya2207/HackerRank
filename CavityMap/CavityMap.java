//package hackerrank1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CavityMap {

    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {
        String res[]=new String[grid.length];
        for(int i=0;i<grid.length;i++)
        {
            res[i]="";
        }
        for(int i=0;i<grid.length;i++)
        {
            if(i==0 || i==grid.length-1)
            {
                    res[i]=grid[i];
            }
            else{
                res[i]=res[i]+grid[i].charAt(0);
                for(int j=1;j<grid.length-1;j++)
                {
                    if(grid[i].charAt(j)>grid[i].charAt(j+1) && grid[i].charAt(j)>grid[i].charAt(j-1) && grid[i].charAt(j)>grid[i-1].charAt(j) && grid[i].charAt(j)>grid[i+1].charAt(j))
                    {
                     res[i]=res[i]+"X";
                    }
                    else
                    {
                        res[i]=res[i]+grid[i].charAt(j);
                    }
                }
                res[i]=res[i]+grid[i].charAt(grid.length-1);
            }
        }
        
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            //bufferedWriter.write(result[i]);
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

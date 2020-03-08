import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
//10 2 3
//3 1
//5 2 8
public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        //System.out.println("Inside");
         int sum=0;
         int max=0;
        for(int i=0;i<keyboards.length;i++)
         {
             for(int j=0;j<drives.length;j++)
             {
                 sum=keyboards[i]+drives[j];
                 if(sum<=b && sum>max)
                 {
                     max=sum;
                 }
                 if(max==0)
                 {
                     max=-1;
                 }
             }
         }
        
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner in =new Scanner(System.in);
        int b=in.nextInt();
        int n=in.nextInt();
        int m=in.nextInt();
        
        int[] keyboards = new int[n];

        
        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            //int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] =in.nextInt();
        }

        int[] drives = new int[m];

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            //int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = in.nextInt();
        }

        int moneySpent = getMoneySpent(keyboards, drives, b);
        System.out.println(moneySpent);

        scanner.close();
    }
}

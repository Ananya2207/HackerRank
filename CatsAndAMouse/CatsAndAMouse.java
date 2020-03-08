import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CatsAndAMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        String result="";
        if(x==y)
        {
            result="Mouse C";
        }
        else if(x>z && y>z)
        {
            if(x==y)
            {
            result="Mouse C";
            }
            else if(x-z<y-z)
            {
                result="Cat A";
            }
            else //if(x-z>y-z)
            {
                result="Cat B";
            }
        }
        else if(x<z && y<z)
        {
            if(x==y)
            {
            result="Mouse C";
            }
            else if(z-x<z-y)
            {
                result="Cat A";
            }
            else// if(z-x<z-y)
            {
                result="Cat B";
            }
        }
        else if(x>z && y<z)
        {
            if(x-z==z-y)
            {
               result="Mouse C"; 
            }
            else if(x-z<z-y)
            {
                result="Cat A";
            }
            else //if(x-z>z-y)
            {
                result="Cat B";
            }
        }
        else{
            //System.out.println("Inside else");
            if(y-z==z-x)
            {
               result="Mouse C"; 
            }
            else if(y-z<z-x)
            {
                result="Cat B";
            }
            else// if(y-z>z-x)
            {
                result="Cat A";
            }
        }
        
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);
              System.out.println(result);  
            //bufferedWriter.write(result);
            //bufferedWriter.newLine();
        }

       // bufferedWriter.close();

        scanner.close();
    }
}

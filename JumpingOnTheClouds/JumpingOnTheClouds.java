/*
Aerith is playing a cloud hopping game. In this game, there are sequentially numbered clouds that can be thunderheads or cumulus clouds. Her character must jump from cloud to cloud until it reaches the start again.

To play, Aerith is given an array of clouds,  and an energy level . She starts from  and uses  unit of energy to make a jump of size  to cloud . If Aerith lands on a thundercloud, , her energy () decreases by  additional units. The game ends when Aerith lands back on cloud .

Given the values of , , and the configuration of the clouds as an array , can you determine the final value of  after the game ends?

For example, give  and , the indices of her path are . Her energy level reduces by  for each jump to . She landed on one thunderhead at an additional cost of  energy units. Her final energy level is .

Note: Recall that  refers to the modulo operation. In this case, it serves to make the route circular. If Aerith is at  and jumps , she will arrive at .

Function Description

Complete the jumpingOnClouds function in the editor below. It should return an integer representing the energy level remaining after the game.

jumpingOnClouds has the following parameter(s):

c: an array of integers representing cloud types
k: an integer representing the length of one jump
Input Format

The first line contains two space-separated integers,  and , the number of clouds and the jump distance.
The second line contains  space-separated integers  where . Each cloud is described as follows:

If , then cloud  is a cumulus cloud.
If , then cloud  is a thunderhead.
Constraints

Output Format

Print the final value of  on a new line.
*/
//package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int e=100;
        
        for(int i=0;i<c.length;){
        
        if(i+k<c.length)
        {
            i=i+k;
            if(c[i]==1){e=e-3;}
            else {e=e-1;}
            
        }
        else
        {
            i=(i+k)-c.length;
            if(i==0)
            {if(c[i]==1){e=e-3;}
            else {e=e-1;}
             break;   
            }
            else{
               if(c[i]==1){e=e-3;}
            else {e=e-1;} 
            }
        }
        }
        
        return e;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

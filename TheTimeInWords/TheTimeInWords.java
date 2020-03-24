//package hackerrank1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TheTimeInWords {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        String result="";
        
        ArrayList<String> hour=new ArrayList<String> ();
        hour.add("one");
        hour.add("two");
        hour.add("three");
        hour.add("four");
        hour.add("five");
        hour.add("six");
        hour.add("seven");
        hour.add("eight");
        hour.add("nine");
        hour.add("ten");
        hour.add("eleven");
        hour.add("twelve");
        
        ArrayList<String> bmin=new ArrayList<String> ();
        bmin.add("one minute past");
        bmin.add("two minute past");
        bmin.add("three minute past");
        bmin.add("four minute past");
        bmin.add("five minute past");
        bmin.add("six minute past");
        bmin.add("seven minute past");
        bmin.add("eight minute past");
        bmin.add("nine minute past");
        bmin.add("ten minute past");
        bmin.add("eleven minute past");
        bmin.add("twelve minute past");
        bmin.add("thirteen minute past");
        bmin.add("fourteen minute past");
        bmin.add("quarter past");
        //bmin.add("fifteen minute past");
        bmin.add("sixteen minute past");
        bmin.add("seventeen minute past");
        bmin.add("eighteen minute past");
        bmin.add("nineteen minute past");
        bmin.add("twenty minute past");
        bmin.add("twenty one minute past");
        bmin.add("twenty two minute past");
        bmin.add("twenty three minute past");
        bmin.add("twenty four minute past");
        bmin.add("twenty five minute past");
        bmin.add("twenty six minute past");
        bmin.add("twenty seven minute past");
        bmin.add("twenty eight minute past");
        bmin.add("twenty nine minutes past");
        bmin.add("half past");
        
        ArrayList<String> amin=new ArrayList<String> (); 
        amin.add("one minutes to");
        amin.add("two minutes to");
        amin.add("three minutes to");
        amin.add("four minutes to");
        amin.add("five minutes to");
        amin.add("six minutes to");
        amin.add("seven minutes to");
        amin.add("eight minutes to");
        amin.add("nine minutes to");
        amin.add("ten minutes to");
        amin.add("eleven minutes to");
        amin.add("twelve minutes to");
        amin.add("thirteen minutes to");
        amin.add("fourteen minutes to");
        amin.add("quarter to");
        amin.add("sixteen minutes to");
        amin.add("seventeen minutes to");
        amin.add("eightteen minutes to");
        amin.add("nineteen minutes to");
        amin.add("twenty minutes to");
        amin.add("twenty one minutes to");
        amin.add("twenty two minutes to");
        amin.add("twenty three minutes to");
        amin.add("twenty four minutes to");
        amin.add("twenty five minutes to");
        amin.add("twenty six minutes to");
        amin.add("twenty seven minutes to");
        amin.add("twenty eight minutes to");
        amin.add("twenty nine minutes to");
        
        
        
        
        
        
        if(m==0)
        {
            if(h==1)
            {   result="one o' clock";                    }
            else if(h==2)
            {   result="two o' clock";                    }
            else if(h==3)
            {   result="three o' clock";                    }
            else if(h==4)
            {   result="four o' clock";                    }
            else if(h==5)
            {   result="five o' clock";                    }
            else if(h==6)
            {   result="six o' clock";                    }
            else if(h==7)
            {   result="seven o' clock";                    }
            else if(h==8)
            {   result="eight o' clock";                    }
            else if(h==9)
            {   result="nine o' clock";                    }
            else if(h==10)
            {   result="ten o' clock";                    }
            else if(h==11)
            {   result="eleven o' clock";                    }
            else{
                result="twelve o' clock";
            }
        }
        else if(m>=1 && m<=30) 
        {
            for(int i=0;i<12;i++)
            {
                if(i==h-1)
                {
                    for(int j=0;j<30;j++)
                    {
                        if(m-1==j)
                        {
                            result=bmin.get(j)+" "+hour.get(i);
                        }
                    }
                }
            }
        }
        else
        {
            for(int i=0;i<12;i++)
            {//System.out.println("inside");
                if(i==h)
                {int count=0;
                    //System.out.println("i="+i);
                    for(int j=59;j>30;j--)
                    {//System.out.println("j="+j);
                        
                        if(m==j)
                        {
                            result=amin.get(count)+" "+hour.get(i);
                        }
                        count++;
                        //System.out.println("count="+count);
                    }
                }
            }
        }

        return result; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);
        System.out.println(result);
        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

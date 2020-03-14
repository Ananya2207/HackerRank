package hackerrank;

import java.io.*;
import java.util.*;

public class Day18QueuesAndStacks {
    // Write your code here.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18QueuesAndStacks p = new Day18QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

    ArrayList obj1=new ArrayList();
        
    void pushCharacter(char c) {
       obj1.add(c);
    }
    ArrayList obj2=new ArrayList();
    void enqueueCharacter(char c) {
        obj2.add(c);
    }

    char popCharacter() {
    char a=(char) obj1.get(obj1.size()-1);
    obj1.remove(obj1.size()-1);
    return a;
    }

    char dequeueCharacter() {
        char a=(char) obj2.get(0);
        obj2.remove(0);
        return a;
    }
}

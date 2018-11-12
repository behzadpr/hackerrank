import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int secondInt;
        double secondDouble;
        String secondString;

        /* Read and save an integer, double, and String to your variables.*/
        secondInt=scan.nextInt();
        secondInt+=i;
        secondDouble=scan.nextDouble();
        secondDouble+=d;
        /* Scanner is skipping nextLine() after using next() */
        scan.nextLine();
        secondString=scan.nextLine();
        secondString=s+secondString;
        /* Print the sum of both integer variables on a new line. */
        /* Print the sum of the double variables on a new line. */
        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */
        System.out.println(secondInt);
        System.out.println(secondDouble);
        System.out.println(secondString);
        scan.close();
    }
}

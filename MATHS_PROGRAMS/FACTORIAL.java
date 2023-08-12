package MATHS_PROGRAMS;
import java.util.*;
public class FACTORIAL {

	 public static void main(String args[])
	    {
	        //1.Write a program to find the factorial of given number.
	        Scanner scan =new Scanner(System.in);
	        System.out.print("Enter The Number : ");
	        int n=scan.nextInt();
	        int f=1;
	        for(int i=1;i<=n;i++)
	        {
	            f=f*i;
	        }
	        System.out.println("Factorial of "+n+" is "+f);
	    }
}

package MATHS_PROGRAMS;
import java.util.Scanner;
//Write a program to find the fibonacci series of given number.
public class FIBANCCI {
	 public static void main(String args[])
	    {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter The Number : ");
	        int n=scan.nextInt();
	        int a=-1,b=1,c;
	        System.out.println(n+"s fibonacci series ");
	        for(int i=1;i<=n;i++)
	        {
	            c=a+b;
	            System.out.println(c); 
	            a=b;
	            b=c;
	        }
	    }
}

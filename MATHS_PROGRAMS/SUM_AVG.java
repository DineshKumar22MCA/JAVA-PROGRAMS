package MATHS_PROGRAMS;
import java.util.Scanner;
//Write a program to find the sum and average of given n numbers.

public class SUM_AVG {

	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter The Limit: ");
	        int n=scan.nextInt();
	        int sum=0,a;
	        for(int i=1;i<=n;i++)
	        {
	            System.out.println("Enter The Number "+i+": ");
	            a=scan.nextInt();
	            sum+=a;
	        }
	        System.out.println("The sum of given numbers is     : "+sum);
	        System.out.println("The Average of given numbers is : "+sum/n);
	    }
}

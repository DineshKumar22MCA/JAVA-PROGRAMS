package VARIABLE;

import java.util.Scanner;

//swap the two value using multiplication and division
public class swap3 {
	public static void main (String args[] ) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter the value of a : ");
		int a = scan.nextInt();
		
		System.out.print("Enter the value of b : ");
		int b = scan.nextInt();
				
		System.out.println("before swap a : "+a);
		System.out.println("before swap b : "+b);

		a = a*b;
		b = a/b;
		a = a/b;
		
		System.out.println("after swap a : "+a);
		System.out.println("after swap b : "+b);
		
		
	}
}

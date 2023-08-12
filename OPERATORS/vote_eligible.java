package OPERATORS;

import java.util.Scanner;

//given age vote eligible are not
public class vote_eligible {
	public static void main (String args[]) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.print("Enter the Age : ");
		int age = scan.nextInt();
		
		String result = age>=18 ? "eligible ":"not eligible";
		
		System.out.println("your "+result+" for vote");
	
	
	}
}

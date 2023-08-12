package OPERATORS;
//maximimum of two number
import java.util.Scanner;

public class maximum_number {
	public static void main (String args[]) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter the value of a : ");
		int a = scan.nextInt();
		
		System.out.print("Enter the value of b : ");
		int b = scan.nextInt();
		
		int c = a > b ? a : b ;
		
		System.out.println(c +" is a maximum number");
		
	}
}

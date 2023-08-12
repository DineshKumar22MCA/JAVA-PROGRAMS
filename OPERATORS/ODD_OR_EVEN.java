package OPERATORS;
//given number is odd or even
import java.util.Scanner;

public class ODD_OR_EVEN {
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int a = scan.nextInt();
		
		String b = a%2==0 ? "even number" : "odd number" ; 
		
		System.out.println("the given number is "+b);
	
	
	}
}

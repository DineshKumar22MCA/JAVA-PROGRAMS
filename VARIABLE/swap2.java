package VARIABLE;
//swap the two values without using third variable using addition,subtraction
import java.util.Scanner;

public class swap2 {
		public static void main (String args[] ) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter the value of a : ");
		int a = scan.nextInt();
		
		System.out.print("Enter the value of b : ");
		int b = scan.nextInt();
				
		System.out.println("before swap a : "+a);
		System.out.println("before swap b : "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("after swap a : "+a);
		System.out.println("after swap b : "+b);
}
}

package VARIABLE;
import java.util.*;
//swap the two values without using third variable
public class swap1 {
	public static void main (String args[] ) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter the value of a : ");
		int a = scan.nextInt();
		
		System.out.print("Enter the value of b : ");
		int b = scan.nextInt();
		
		int c = 0 ;
		
		System.out.println("before swap a : "+a);
		System.out.println("before swap b : "+b);
		c = b;
		b = a;
		a = c;
		
		System.out.println("after swap a : "+a);
		System.out.println("after swap b : "+b);
		System.out.println(c);
		
		
	}
}

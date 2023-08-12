package IF_STATEMENT;

import java.util.Scanner;

public class SIMPLE_IF {
	public static void main (String args[]) {
		
		Scanner scan = new Scanner (System.in);
		
		int age = scan.nextInt();
		
		if(age>=18) {
			System.out.println("you can vote");
		}else {
			System.out.println("you cant vote");
		}
	}
}

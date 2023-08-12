package IF_STATEMENT;

import java.util.Scanner;

public class WEEK_DAYS {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("week");
		System.out.print("enter the number : ");
		int num = scan.nextInt();
		
		if(num==1) {
			System.out.println("sunday");
		}
		else if(num==2) {
			System.out.println("monday");
		}
		else if(num==3) {
			System.out.println("tuesday");
		}
		else if(num==4) {
			System.out.println("wednessday");
		}
		else if(num==5) {
			System.out.println("thursday");
		}
		else if(num==6) {
			System.out.println("friday");
		}
		else if(num==7) {
			System.out.println("saturday");
		}
		else{
			System.out.println("enter correct number");
		}
		
		
		
	}

}

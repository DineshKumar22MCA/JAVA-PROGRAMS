package MATHS_PROGRAMS;

import java.util.Scanner;

public class ARMSTRONG_NUM {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.print("Enter the 3 digit number : ");
		int num = scan.nextInt();
		int temp = num;
		int digit =0;
		int rem ;
		
		while(temp != 0) {
			
			rem = temp % 10;
			digit = (rem*rem*rem)+digit;
			temp = temp / 10;
			
		}
		
		System.out.println("result : "+digit);
		
		if(num==digit)
		{
			System.out.println(num+" is an armstrong number ");
		}
		else
		{
			System.out.println(num+" is an not armstrong number");
		}
		
		
	}

}

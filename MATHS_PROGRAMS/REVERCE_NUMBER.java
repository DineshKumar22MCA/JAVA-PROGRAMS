package MATHS_PROGRAMS;

import java.util.Scanner;

public class REVERCE_NUMBER {

	  //Write a program to find the reverse of N digit Number
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = scan.nextInt();
        int reverse=0, rem;
        while(n!=0)
        {
            rem=n%10;
            reverse=(reverse*10)+rem;
            n=n/10;
        }
        System.out.println("Reversed Number  : "+reverse);
    }
}

package MATHS_PROGRAMS;

import java.util.Scanner;

public class FACT_OF_NUMBER {
	 //Write a program to find the factor of the given number.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}

package MATHS_PROGRAMS;

import java.util.Scanner;

public class STRONG_NUMBER {
	//Write a program to check the given number is Strong number or not.
    public static void main(String args[])
    {
        int num,originalNum,rem,fact,i,sum=0;
        Scanner SCAN = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=SCAN.nextInt();
        originalNum=num;
        while (num>0)
        {
            rem=num%10;
            fact=1;
            for(i=1;i<=rem;i++){
                fact*=i;
            }
            
            sum+=fact;
            num=num/10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is STRONG NUMBER");
        } else {
            System.out.println(originalNum + " is not a STRONG NUMBER");
        }
    }
}

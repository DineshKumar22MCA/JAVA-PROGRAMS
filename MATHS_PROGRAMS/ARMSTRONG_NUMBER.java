package MATHS_PROGRAMS;

import java.util.Scanner;

public class ARMSTRONG_NUMBER {
	 //Write a program to check whether the given 3 digit number is armstrong or not
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 3 Digit Number : ");
        int number = scan.nextInt();//123
        int temp = number;//123
        int digit1, digit2, digit3;
 
        digit3=temp%10;
        temp=temp/10;
 
        digit2=temp%10;
        temp=temp/10;
 
        digit1=temp%10;
        int result=(digit1 * digit1 * digit1)+( digit2 * digit2 * digit2)+(digit3 * digit3 * digit3);
 
        if(number==result){
            System.out.println(number + " is armstrong Number");
        }else{
            System.out.println(number + " is not an armstrong Number");
        }
 
 
    }
}

package IF_STATEMENT;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		 int a,b,c,ch;
	        System.out.println("1.Addition");
	        System.out.println("2.Subtraction");
	        System.out.println("3.Multiplication");
	        System.out.println("4.Division");
	        System.out.print("Enter Your Choice : ");
	        Scanner scan =new Scanner(System.in);
	        ch=scan.nextInt();
	        System.out.println("Enter 2 Nos : ");
	        a=scan.nextInt();
	        b=scan.nextInt();

	        if (ch==1) {
	        	  c=a+b;
	                System.out.println("Addition : " +c);
	        }
	        else if (ch==2) {
	        	  c=a-b;
	                System.out.println("subtraction : " +c);
	        }
	        else if (ch==3) {
	        	  c=a*b;
	                System.out.println("Multiplication : " +c);
	        }
	        else if (ch==2) {
	        	  c=a/b;
	                System.out.println("division : " +c);
	        }
	        else {
	        	System.out.println("invalid option");
	        }
	        
	}

}

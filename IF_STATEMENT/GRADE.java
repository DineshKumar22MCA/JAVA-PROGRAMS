package IF_STATEMENT;
import java.util.*;
public class GRADE {

 public static void main(String args[]) {
        float avg;
        System.out.print("Enter The Average Mark : ");
        Scanner scan = new Scanner(System.in);
        avg = scan.nextFloat();
        if (avg >= 90 && avg <= 100) {
            System.out.println("Grade A");
        } else if (avg >= 80 && avg <= 89) {
            System.out.println("Grade B");
        } else if (avg >= 70 && avg <= 79) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }
}
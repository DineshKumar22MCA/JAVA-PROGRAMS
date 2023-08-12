package LOOP;
//odd numbers list sum count into 10
public class ODD_SUM_COUNT {

	public static void main (String args[]) {
		
		int sum =0;
		int count = 0;
		System.out.println("odd numbers ");
	for(int i = 1; i <= 10; i+=2) {
		System.out.println(i);
		sum = sum +i;
		count++;
		
	}
	
	System.out.println("sum of odd numbers   : "+sum);
	System.out.println("count of odd numbers : "+count);
	}
}

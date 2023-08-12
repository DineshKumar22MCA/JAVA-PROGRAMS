package LOOP;

public class EVEN_SUM_COUNT {

	public static void main(String[] args) {

	int i = 2;
	int sum =0;
	int count =0;
	
	while(i<=10) {
		
		System.out.println(i);
		sum += i;
		count++;
		i += 2;
		
	}
	System.out.println("even numbers total : "+sum);
	System.out.println("even numbers count : "+count);

	}

}

package STRING;

public class lowercase {
	 public static void main(String args[]) {
	        //Program to Convert string to LowerCase
	        StringBuilder a = new StringBuilder("VIRAT");
	        System.out.println("Original Input : "+a);
	        for(int i=0;i<a.length();i++)
	        {
	            if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
	                int c=(int)a.charAt(i)+32;
	                a.setCharAt(i,(char)c);
	            }
	        }
	        System.out.println("Lowercase Output: "+a);
	 
	 
	    }
}

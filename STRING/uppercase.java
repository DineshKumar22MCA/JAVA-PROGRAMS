package STRING;

public class uppercase {
	public static void main(String args[]) {
        //Program to Convert string to Uppercase
        StringBuilder a = new StringBuilder("virat");
        System.out.println("Original Input : "+a);
        for(int i=0;i<a.length();i++)//97-122
        {
            if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                int c=(int)a.charAt(i)-32;
                a.setCharAt(i,(char)c);
            }
        }
        System.out.println("Uppercase Output: "+a);
 
    }
}

import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
       Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      int f=n%100;
      int l=f/10;
      System.out.println(l);
      
	}
}
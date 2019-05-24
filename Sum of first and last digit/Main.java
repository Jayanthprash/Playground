import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      int f,l,sum;
      f=n;
      while(f>=10)
      {
        f=f/10;
      }
      l=n%10;
      sum=f+l;
      System.out.println(sum);
	}
}
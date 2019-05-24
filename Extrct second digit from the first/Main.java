import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      int f,l;
      f=n;
      while(f>=100)
      {
        f=f/10;
      }
      l=f%10;
       System.out.println(l);
	}
}
      
      
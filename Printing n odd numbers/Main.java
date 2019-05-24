import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
    
     int k=2*n-1;
      for(int i=0;i<=k;i++)
      {
        if((i%2)!=0)
        {
          System.out.println(i);
        }
      }
	}
}
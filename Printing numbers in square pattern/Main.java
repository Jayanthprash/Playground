import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      for(int j =1;j <=n;j++)
      {
        for(int i = 1;i<=n;i++)
        {
          System.out.print(j);
        }
        System.out.println();
      }
        
	}
}
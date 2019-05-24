import java.util.Scanner;
class Main{
  public static int son(int m)
  {
    int sd=0;
    for( int i=1;i<=m;i++)
    {
      sd=sd+i;
    }
    return sd;
  }
	public static void main (String[] args){
	    // Type your code here
       Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int sum =son(n);
      System.out.println(sum);
      
	}
}
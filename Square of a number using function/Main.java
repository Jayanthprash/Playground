import java.util.Scanner;
class Main
{
  public static int square(int m)
  {
    int ss;
    ss = (m*m);
    return ss;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int sq = square(n);
      System.out.println(sq);
	} 
}
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int rev=0;
     while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
     }
    System.out.println(rev);
  }
}
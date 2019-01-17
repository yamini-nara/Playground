import java.util.*;
class Main{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int b=in.nextInt();
    int e=in.nextInt();
    power(b,e);
  }
  public static void power(int b,int e)
  {
    int pow=1;
    for(int i=1;i<=e;i++)
      pow=pow*b;
    System.out.println(pow);
  }
}
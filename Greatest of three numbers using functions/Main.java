import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int c=gt(n1,n2);
      int g=gt(c,n3);
      System.out.println(g);
	}
  public static int gt(int n1,int n2)
  {
    if(n1>n2)
      return n1;
    else
      return n2;
  }
}
import java.util.Scanner;
class Main{
  /*public static int sum(int i,int k)
  {
    //int s=0;
    int s=k+i;
    return s;
  }*/
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int d=0;
      for(int i=1;i<=n;i++)
      {
        d=d+i;
      }
      System.out.print(d);
	}
}
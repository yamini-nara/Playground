import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=n;
      int ld,sum=0;
      while(n>0)
      {
        ld=n%10;
        int fact=1;
        for(int j=1;j<=ld;j++)
        {
          fact=fact*j;
        }
        sum=sum+fact;
        n=n/10;
      }
      if(sum==k)
        System.out.println("Yes");
      else
        System.out.println("No");
      
          
	}
}
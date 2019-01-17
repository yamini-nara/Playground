import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=0;
      int c=n;
      if(n==0)
        System.out.println(n);
      else
      {
          while(n>0)
          {
            count++;
            n=n/10;
           }
      }
      n=c;
      int sum=0;
      int pow=1;
      while(n>0)
      {
        int r=n%10;
        for(int i=1;i<=count;i++)
        {
          pow=pow*r;
        }
        sum=sum+pow;
        pow=1;
        n=n/10;
         }
      if(c==sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}
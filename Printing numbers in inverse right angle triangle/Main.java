import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in =new Scanner(System.in);
      int n=in.nextInt();
     int num=n;
      for(int i=1;i<=n;i++,num--)
        {
            for(int j=num;j>0;j--)
            {
              System.out.print(j);
            }
        System.out.println();
      }
        
      
        
	}
}
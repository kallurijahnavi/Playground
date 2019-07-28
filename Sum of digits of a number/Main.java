import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int sum=0,d;
	   Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       while(n>0)
       {
          d=n%10;
          sum=sum+d;
         n=n/10;
       }
      System.out.println(sum);
 
         
          
	}
}
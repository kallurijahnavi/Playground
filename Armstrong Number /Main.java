import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  int sum=0;
  Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int temp=n;
    while(n>0)
    {
      int r=n%10;
      int c=r*r*r;
      sum=sum+c;
      n=n/10;
    }
    n=temp;
    if(n==sum)
    { 
        System.out.println("Armstrong Number");
    }
    else 
    {
         System.out.println("Not a Armstrong Number");
    }
}
}
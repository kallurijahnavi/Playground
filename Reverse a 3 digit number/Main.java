import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int n,first_digit,second_digit,third_digit,reverse;
   
    Scanner in=new Scanner(System.in);
    n=in.nextInt();
    first_digit=n/100;
    second_digit=(n/10)%10;
    third_digit=n%10;
    reverse=(third_digit*100)+(second_digit*10)+first_digit;
    System.out.println(reverse);
     }
}
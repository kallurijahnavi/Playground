import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		int n,first_digit,third_digit,sum;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
       first_digit=n/100;
       third_digit=n%10;
       sum=first_digit+third_digit;
       System.out.println(sum);
	}
}
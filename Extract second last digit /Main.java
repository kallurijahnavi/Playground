import java.util.Scanner;
class Main {
	public static void main (String[] args) {
       int n,sld;
       Scanner in=new Scanner(System.in);
       n=in.nextInt();
       sld=(n/10)%10;
      System.out.println(sld);
	}
}
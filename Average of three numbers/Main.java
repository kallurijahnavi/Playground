import java.util.*;
class Main {
	public static void main (String[] args) {
		int n1,n2,n3,sum,avg;
        Scanner in=new Scanner(System.in);
        n1=in.nextInt();
        n2=in.nextInt();
        n3=in.nextInt();
        sum=n1+n2+n3;
        avg=sum/3;
        System.out.println(avg);
	}
}
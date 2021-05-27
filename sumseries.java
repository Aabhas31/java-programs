import java.util.Scanner;
public class sumseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1,sum=0;
		System.out.println("enter the value of n  ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for (int i=0;i<=n;i++)
	    sum=sum+i;
		System.out.println("sum of series is"+sum);
		}
	
}

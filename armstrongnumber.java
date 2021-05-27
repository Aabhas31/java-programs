import java.util.Scanner;
public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,c,armstrong=0;
		System.out.println("enter the value of n  ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while (n>0)
	    {
			r=n%10;
			armstrong=(r*r*r)+armstrong;
			n=n/10;
		}
		if (c==armstrong)
			System.out.println("It is armstrong number");
		else
			System.out.println("it is not armstrong number");
		}

}

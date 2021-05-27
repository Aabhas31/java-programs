import java.util.Scanner;

public class greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,z,max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x");
		System.out.println("enter y");
		System.out.println("enter z");
		
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		if (x>y)
	       max=x;
		else
			max=y;
		if(x>z)
			max=x;
		else
			max=z;
		System.out.println("greatest number "+max);
	       }
}


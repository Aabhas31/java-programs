import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,i,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a");
		n=sc.nextInt();

		for (i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;	
			}
		
}
        if(c==2)
        	System.out.println("it is a prime number");
        else
        	System.out.println("it is not a prime number");
}
}
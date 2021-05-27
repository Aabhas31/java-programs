import java.util.Scanner;
public class Nprimenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2;
		System.out.println("enter two numbers");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		int i,j;
		for (i=n1;i<=n2;i++)
		{
			for(j=2;j<=i;j++)
			{
				if (i%j==0)
					break;
				}
			if (i==j)
				System.out.println(""+j);
			
		     }
		}

}

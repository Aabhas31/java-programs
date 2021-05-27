import java.util.Scanner;

public class swapnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,temp=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter 1st number");
		a=sc.nextInt();
		
		System.out.println("enter 2nd number");
		b=sc.nextInt();
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("value of a  "  +a);
		System.out.println("value of b "  +b);
		
		}

}

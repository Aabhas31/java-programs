import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum1;
		String sum2;
		String p,q;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a");
		a=sc.nextInt();
	    System.out.println("enter value of b");
		b=sc.nextInt();
		System.out.println("enter the char1");
		 p=sc.next(); 
		
		System.out.println("enter the char2");
	       q=sc.next(); 
		sum1=a+b;
		sum2=p+q;
		System.out.println("answer is "+sum1);
		System.out.println("answer is "+sum2);
	}

}

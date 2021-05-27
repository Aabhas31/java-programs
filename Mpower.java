import java.util.Scanner;
public class Mpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,m,ans;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n");
		n=sc.nextInt();
		
		System.out.println("enter the value of m");
		m=sc.nextInt();
		 
		ans=(int) Math.pow(n,m);
		System.out.println("power result"+ans);
        }

}

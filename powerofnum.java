import java.util.Scanner;
public class powerofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,power,ans;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n");
		n=sc.nextInt();
		
		System.out.println("power =");
		power=sc.nextInt();
		 
		ans=(int) Math.pow(n,power);
		System.out.println("power result  "+ans);

	}

}
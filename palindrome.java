import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,c,s=0,r;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        c=n;
        while(n>0)
        { r=n%10;
          s=(s*10)+r;
          n=n/10;
        
       }
        if (c==s)
        	System.out.println("palindrome number");
        else
        	System.out.println("it is not a palindrome number");

	}

}

import java.util.Scanner;

public class oddevensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,i,even=0,odd=0;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        
        for(i=1;i<n;i++)
        {
     	   	if(i%2==0)
     	   even=even+i;
     	   	else
        	odd=odd+i;
        }
        System.out.println("even numbers  "+even);
        System.out.println("odd numbers  "+odd);
	}
       
}

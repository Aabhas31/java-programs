import java.util.Scanner;

public class ci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double ci;
		double n,p,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("n");
        n=sc.nextInt();
        System.out.println("p");
        p=sc.nextInt();
        System.out.println("r");
        r=sc.nextInt();
        
        ci=p*Math.pow(1+r/100,n);
        System.out.println(""+ci);
        
        
        
	}

}

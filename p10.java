package patterns;
import java.util.Scanner;

public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt(); 
		int sp=0;
		int st=2*n-1;
		for(int i=1;i<=n;i++)
		{
			//space
			for(int j=1;j<=sp;j++)
				System.out.print("  ");
			
			//for *
			for(int k=1;k<=st;k++)
				System.out.print("* ");
			System.out.println();
			sp=sp+1;
			st=st-2;
		}

	}

}

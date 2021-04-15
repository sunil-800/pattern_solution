package patterns;
import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt(); 
		int sp=n-1;
		int st=1;
		for(int i=1;i<=n;i++)
		{
			int s=1;
			//space
			for(int j=1;j<=sp;j++)
				System.out.print("  ");
			
			//for *
			for(int k=1;k<=st;k++)
			{
				if(s%2!=0)
					System.out.print("* ");
				else
					System.out.print("  ");
				s=s+1;
				
			}
			System.out.println();
			sp=sp-1;
			st=st+2;
		}

	}

}

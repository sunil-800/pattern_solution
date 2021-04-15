package patterns;
import java.util.Scanner;

public class p16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sp=n-1;
		int st=n;
		for(int i=1;i<=2*n-1;i++)
		{
			//space
			for(int j=1;j<=sp;j++)
				System.out.print("  ");
			//for *
			for(int k=1;k<=st;k++)
				System.out.print("* ");
			
			if(i<n)
			{
				sp=sp-1;
				st=st-1;
			}
			else
			{
				sp=sp+1;
				st=st+1;
			}
			System.out.println();
		}


	}

}

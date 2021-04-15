package patterns;
import java.util.Scanner;

public class p19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int st=n/2;
		int sp=1;
		for(int i=1;i<=n;i++)
		{
			if(i==1 || i==n)
			{
				for(int j=1;j<=n;j++)
					System.out.print("* ");
			}
			else
			{
				for(int k=1;k<=st;k++)
					System.out.print("* ");
				for(int l=1;l<=sp;l++)
					System.out.print("  ");
				for(int m=1;m<=st;m++)
					System.out.print("* ");
			}
			System.out.println();
			if(i>1 && i<n)
			{
				if(i<=n/2)
				{
					st=st-1;
					sp=sp+2;
				}
				else
				{
					st=st+1;
					sp=sp-2;
				}
			}
		}

	}

}

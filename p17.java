package patterns;
import java.util.Scanner;

public class p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int st=n/2;
		int sp=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=st;j++)
				System.out.print("* ");
			for(int k=1;k<=sp;k++)
				System.out.print("  ");
			for(int l=1;l<=st;l++)
				System.out.print("* ");
			System.out.println();
			
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

package patterns;
import java.util.Scanner;

public class p18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sp=n/2;
		int st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
				System.out.print("  ");
			for(int k=1;k<=st;k++)
				System.out.print("* ");
			System.out.println();
			
			if(i<=n/2)
			{
				sp=sp-1;
				st=st+2;
			}
			else
			{
				sp=sp+1;
				st=st-2;
			}
		}

	}

}

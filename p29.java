package patterns;
import java.util.Scanner;

public class p29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sp=n-1;
		int print=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
				System.out.print("  ");
			for(int k=1;k<=print;k++)
			{
				if(k==1 || k==print)
				System.out.print(i+" ");
				else
					System.out.print("0 ");
			}
			System.out.println();
			sp=sp-1;
			print=print+2;
		}

	}

}

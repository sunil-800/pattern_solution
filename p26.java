package patterns;
import java.util.Scanner;

public class p26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sp=n-1;
		int p=1;
		for(int i=1;i<=n;i++)
		{
			int l=1;
			for(int j=1;j<=sp;j++)
				System.out.print("  ");
			for(int k=1;k<=p;k++)
			{
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
			p=p+2;
			sp=sp-1;
			
		}

	}

}

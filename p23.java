package patterns;
import java.util.Scanner;

public class p23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sp=n-1;
		int one=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
				System.out.print("  ");
			for(int k=1;k<=one;k++)
				System.out.print("1 ");
			System.out.println();
			one=one+2;
			sp=sp-1;
			
		}

	}

}

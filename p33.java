package patterns;
import java.util.Scanner;

public class p33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sp=n-1;
		int print=1;
		for(int i=n;i>=1;i--)
		{
			int s=i;
			for(int j=1;j<=sp;j++)
				System.out.print("  ");
			for(int k=1;k<=print;k++)
			{
				if(s==n)
				System.out.print("0 ");
				else
					System.out.print(s+" ");
				
				if(k<=print/2)
					s++;
				else
					s--;
			}
			System.out.println();
			sp=sp-1;
			print=print+2;
		}

	}

}

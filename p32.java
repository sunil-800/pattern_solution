package patterns;
import java.util.Scanner;

public class p32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int print=1;
		int p=1;
		for(int i=1;i<2*n;i++)
		{
			int s=1;
			for(int j=1;j<=print;j++)
			{
				if(s%2==1)
				System.out.print(p+" ");
				else
					System.out.print("* ");
				s++;
			}
			System.out.println();
			if(i<n)
			{
				print+=2;
				p++;
			}
			else
			{
				print-=2;
				p--;
			}
			
		}

	}

}

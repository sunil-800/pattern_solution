package patterns;
import java.util.Scanner;

public class p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sp=n-1;
		int st=1;
		for(int i=1;i<=2*n-1;i++)
		{
			//space 
			for(int k=1;k<=sp;k++)
				System.out.print("  ");
			for(int j=1;j<=st;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(i<n)
			{
				st++;
				sp--;
			}
			else
			{
				st--;
				sp++;
			}
			
			
		}

	}

}

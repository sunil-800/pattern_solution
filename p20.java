package patterns;
import java.util.Scanner;

public class p20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int f=n/2+1;
		int l=n/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==f || j==l)
					System.out.print("*  ");
				else
					System.out.print("   ");
			}
			System.out.println();
			
			if(i<=n/2)
			{
				f--;
				l++;
			}
			else
			{
				f++;
				l--;
			}
		}
		
	}

}

package patterns;
import java.util.Scanner;

public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt(); 
		int st=1;
		for(int i=1;i<=2*n-1;i++)
		{
			for(int j=1;j<=st;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(i<n)
				st++;
			else
				st--;
			
		}

	}

}

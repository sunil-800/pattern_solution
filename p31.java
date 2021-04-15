package patterns;
import java.util.Scanner;

public class p31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				if(j==i)
					System.out.print("* ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}

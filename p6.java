package patterns;

import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt(); 
		int s=0;
		for(int i=1;i<=n;i++)
		{
			//space
			for(int j=1;j<=s;j++)
				System.out.print("  ");
			//for *
			for(int k=n+1-i;k>=1;k--)
				System.out.print("* ");
		  s+=2;
			System.out.println();
		}

	}

}

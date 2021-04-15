package patterns;

import java.util.Scanner;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt(); 
		for(int i=n;i>=1;i--)
		{
			//space
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");
			
			//for *
			for(int k=1;k<=i;k++)
				System.out.print("* ");
			
			System.out.println();
		}

	}

}

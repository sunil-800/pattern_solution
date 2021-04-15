package patterns;
import java.util.Scanner;

public class p22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sp=1;
		int st=n-1;
		for(int i=1;i<=n;i++)
		{
           if(i==1)
           {
        	  for(int m=1;m<2*n;m++)
        		  System.out.print("* ");
           }
           else
           {
			for(int j=1;j<=st;j++)
				System.out.print("* ");
			for(int k=1;k<=sp;k++)
				System.out.print("  ");
			for(int l=1;l<=st;l++)
				System.out.print("* ");
			sp=sp+2;
		    st--;
           }
           System.out.println();
			
		}

	}

}

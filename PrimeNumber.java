import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter a number");
		num=Sc.nextInt();
		for (int no=1; no<=num; no++)
		{
			int temp=0;
			for(int i=2; i<=no-1; i++)
			{
				if(no%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(no);
			}
			
		}

	}

}

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter a number");
		 num=Sc.nextInt();
		if(num%2==0) {
			System.out.println(num+ " is even number");
		}else
		{
			System.out.println(num+ " is odd number");
		}
	}
}

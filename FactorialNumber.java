import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, fact = 1;
		System.out.println("Enter a number");
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		for(int i=1; i<=n; i++) {
			fact=fact*i;
			
		}
		System.out.println("factorial  "+fact);
	}

}

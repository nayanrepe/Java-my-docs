import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		double amount;
		double principle;
		double rate;
		double time;

		System.out.println("enter a principle amount: ");
		principle = Sc.nextDouble();

		System.out.println("enter the Rate: ");
		rate = Sc.nextDouble();

		System.out.println("enter the time: ");
		time = Sc.nextDouble();

		amount=principle *Math.pow((1+rate/100),time);
		System.out.println("Total compound Interest: "+amount);
	}

}

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		int sqr, num, sum = 0, rem;
		System.out.println("Enter a number");
		Scanner Sc = new Scanner(System.in);
		num = Sc.nextInt();
		sqr = num * num;
		while (sqr != 0) {
			rem = sqr % 10;
			sum = sum + rem;
			sqr = sqr / 10;
		}
		if (sum == num) {
			System.out.println("number is neon");
		} else {
			System.out.println("number is not neon");
		}
	}
}

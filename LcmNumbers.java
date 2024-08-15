import java.util.Scanner;

public class LcmNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b ,max,step,lcm=0;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a first number:");
		a=Sc.nextInt();
		System.out.println("Enter second number:");
		b=Sc.nextInt();
		if(a > b) {
			max =step=a;
			
		}
		else {
			max=step=b;
			
		}
		while(a!=0) {
			if (max % a==0 && max% b==0) {
				lcm=max;
				break;
			}
			max +=step;
		}
		System.out.println("lcm of given number is:"+lcm);
	}
}

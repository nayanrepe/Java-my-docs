package com.mubicale;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1, n=25;
		System.out.println( +b);
		int c;
		for(int i=1; i<=n; i++) {
			
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}
		

	}

}

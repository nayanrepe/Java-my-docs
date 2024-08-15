import java.util.Scanner;

public class FloatMul{
    
    public static void main (String []args){
       Float a,b,c;
        Scanner Sc=new Scanner(System.in);
         System.out.println("Enter first number:");
         a=Sc.nextFloat();
        System.out.println("Enter second number:");
         b=Sc.nextFloat();
          c=a*b;
         System.out.println("Total:"+c);
    }
}
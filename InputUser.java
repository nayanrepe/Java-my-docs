import java.util.Scanner;

public class InputUser{
    
    public static void main (String []args){
       int a,b,c;
        Scanner Sc=new Scanner(System.in);
         System.out.println("Enter first number:");
         a=Sc.nextInt();
        System.out.println("Enter second number:");
         b=Sc.nextInt();
          c=a+b;
         System.out.println("Total:"+c);
    }
}
//read the number from standard input
import java.util.Scanner;

public class ReadNumber{
    public static void main (String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=s.nextInt();
        s.close();
        System.out.println("The number entered by user:"+num);

    }
}
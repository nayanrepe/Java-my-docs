import java.util.Scanner;
public class LeapYear{
    public static void main(String []args){
        int year;
        System.out.println("enter a year");
        Scanner r=new Scanner(System.in);
        year=r.nextInt();
        if (year % 4==0)
        {
            if (year % 100==0){

                if(year %400 ==0){
                    System.out.println(" leap year");
                     }else{
                     System.out.println("not a leap year");
                     }
                     }else{
                System.out.println(" leap year"); 
                }
                }else
                {
            System.out.println("not a leap year");
             }
             }
             }
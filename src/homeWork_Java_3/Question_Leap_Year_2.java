package homeWork_Java_3;
/**Write a java program to input any year like (ex.2007) and find out if it is leap year or
 not?
 *
 *  */
import java.util.Scanner;

public class Question_Leap_Year_2
{
    public void b()
    {
        Scanner sr= new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sr.nextInt();
        boolean x= (year % 4) == 0;

        if( year % 4==0){
        System.out.println(year+ " is a leap year");
        } else
        {
            System.out.println(year+ " is a not leap year");

        }
        sr.close();
    }

    public static void main(String[] args)
    {   Question_Leap_Year_2 q2 =new Question_Leap_Year_2();
        q2.b();


    }

}

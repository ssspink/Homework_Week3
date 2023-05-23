package homeWork_Java_3;
/**Write a java program to input student Name, roll No, and three subjects Math, Science and
 English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 Input, Marks should between 0 to 100”) and find out total, percentage and result.
 If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 ______________________________
 *  *
 *
 */

import java.util.Scanner;

public class Question_MarkSheet_3
{
    public  void c()
    {
        int m=100;
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter student name:  " );
        String s =sr.next();
        System.out.println("Enter roll no:  ");
        int r =sr.nextInt();
        System.out.println("Math:      ");
        int mm =sr.nextInt();
        if(mm>100)
            System.out.println("invalid input");

        System.out.println("Science: " );
        int sc=sr.nextInt();
        if(sc>100)
            System.out.println("invalid input");
        System.out.println("English:  ");
        int en =sr.nextInt();
        if(en>100)
            System.out.println("invalid input");
        int t=mm+sc+en;
        double pm=t/300.0*100.0;
        sr.close();
        if (m>=80 && m<=100)

        {
            System.out.println("|----------------------|");
            System.out.println("|      Mark Sheet      |");
            System.out.println("|----------------------|");
            System.out.println("| Nanme       : Pinks  |");
            System.out.println("| Roll No     : 94     |");
            System.out.println("|----------------------|");
            System.out.println("| Subjects    : Marks  |");
            System.out.println("|----------------------|");
            System.out.println("| Math        : "+ m+" |");
            System.out.println("| Science     : " +sc+"|");
            System.out.println("| English     : "+ en+"|");
            System.out.println("|----------------------|");
            System.out.println("| Total       :  "+t+" |");
            System.out.println("|----------------------|");
            System.out.println("| Percentages :  "+pm+"|");
            System.out.println("| Result      :  pass  |");
            System.out.println("| Grade       :   A+   |");
            System.out.println("| ---------------------|");

        }
          else if (m<=80 && m>=60)
        {

            System.out.println("|----------------------|");
            System.out.println("|      Mark Sheet      |");
            System.out.println("|----------------------|");
            System.out.println("| Nanme       : Pinks  |");
            System.out.println("| Roll No     : 94     |");
            System.out.println("|----------------------|");
            System.out.println("| Subjects    : Marks  |");
            System.out.println("|----------------------|");
            System.out.println("| Math        : "+ m+" |");
            System.out.println("| Science     : " +sc+"|");
            System.out.println("| English     : "+ en+"|");
            System.out.println("|----------------------|");
            System.out.println("| Total       :  "+t+" |");
            System.out.println("|----------------------|");
            System.out.println("| Percentages :  "+pm+"|");
            System.out.println("| Result      :  pass  |");
            System.out.println("| Grade       :   A    |");
            System.out.println("| ---------------------|");

        }
          else if (m>=60 && m<=50)
        {
            System.out.println("|----------------------|");
            System.out.println("|      Mark Sheet      |");
            System.out.println("|----------------------|");
            System.out.println("| Nanme       : Pinks  |");
            System.out.println("| Roll No     : 94     |");
            System.out.println("|----------------------|");
            System.out.println("| Subjects    : Marks  |");
            System.out.println("|----------------------|");
            System.out.println("| Math        : "+ m+" |");
            System.out.println("| Science     : " +sc+"|");
            System.out.println("| English     : "+ en+"|");
            System.out.println("|----------------------|");
            System.out.println("| Total       :  "+t+" |");
            System.out.println("|----------------------|");
            System.out.println("| Percentages :  "+pm+"|");
            System.out.println("| Result      :  pass  |");
            System.out.println("| Grade       :   B    |");
            System.out.println("| ---------------------|");
        }
          else if (m>=35 && m<=50)
        {
            System.out.println("|----------------------|");
            System.out.println("|      Mark Sheet      |");
            System.out.println("|----------------------|");
            System.out.println("| Nanme       : Pinks  |");
            System.out.println("| Roll No     : 94     |");
            System.out.println("|----------------------|");
            System.out.println("| Subjects    : Marks  |");
            System.out.println("|----------------------|");
            System.out.println("| Math        : "+ m+" |");
            System.out.println("| Science     : " +sc+"|");
            System.out.println("| English     : "+ en+"|");
            System.out.println("|----------------------|");
            System.out.println("| Total       :  "+t+" |");
            System.out.println("|----------------------|");
            System.out.println("| Percentages :  "+pm+"|");
            System.out.println("| Result      :  pass  |");
            System.out.println("| Grade       :   C    |");
            System.out.println("| ---------------------|");

        }else
            System.out.println("Good");


    }
    public static void main(String[] args)
    {
            Question_MarkSheet_3 q3 =new Question_MarkSheet_3();
            q3.c();
    }

}

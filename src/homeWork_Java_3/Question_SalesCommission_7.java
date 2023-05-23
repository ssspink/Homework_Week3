package homeWork_Java_3;
/**Write a java program input sales id, seller's name, sales amount, and salary basic and
 then fined this sales
 Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
 >= 20,000 10%
 >= 10,000 5%
 < 10,000 2%
 *
 */

import java.util.Scanner;

public class Question_SalesCommission_7
{
    public void f()
    {

        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the sales ID:  ");
        int sa = sr.nextInt();
        System.out.println("Enter the seller name: " );
        String na =sr.next();
        System.out.println("Enter the salas amount: ");
        double amount =sr.nextDouble();

    double com;

        if(sa>=50000)
        {
            System.out.println(" Commission is:"   +amount * 35/100 );
        } else if (sa>=30000)
        {
            System.out.println(" Commission is:"  + amount * 20/100);
            
        } else if (sa>=20000)
        {
            System.out.println(" commission is:" + amount *10/100  );

        } else if (sa>=10000)
        {
            System.out.println("commission is:" + amount*5/100 );
        }else if (sa<10000)
        {
            System.out.println("commission is:" +amount *2/100);
        }else
            System.out.println(" he ");
    }
    public static void main(String[] args)
    {
        Question_SalesCommission_7 q1 =new Question_SalesCommission_7();
        q1.f();

    }
}

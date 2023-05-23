package homeWork_Java_3;
/**WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
 * *
 *  *
 */

import java.util.Scanner;

public class Question_Employee_Details_5
{
    public static void d()
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the id");
        int i=in.nextInt();
        System.out.println("Enter the name");
        String na= in.next();
        System.out.println("Enter the salary");
        int sal =in.nextInt();

        double HRA= sal*10/100;
        double TA = sal*8/100;
        double DA = sal*9/100;
        double PF =sal*20/100;
        double GS= sal+HRA+TA+DA-PF;
        System.out.println("|--------------------------------- |");
        System.out.println("|        Salary slip               |");
        System.out.println("|--------------------------------  |");
        System.out.println("| Employee id           :"+i+"     |");
        System.out.println("| Employee Name         :"+na+"    |");
        System.out.println("|----------------------------------|");
        System.out.println("|  Basic salary         : "+ sal+" |");
        System.out.println("| HRA 10%               : " +HRA+" |");
        System.out.println("| TA  8%                : " +TA+"  |");
        System.out.println("| DA 9%                 : " +DA+"  |");
        System.out.println("| PF -20&               : "+ PF+"  |");
        System.out.println("|----------------------------------|");
        System.out.println("|Gross Salary           :  "+GS+"  |" );
        System.out.println("|----------------------------------|");
    }

    public static void main(String[] args) {
        d();
    }
}

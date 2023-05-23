package homeWork_Java_3;

import java.util.Scanner;

/**Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :) *
 *
 */
public class Question_Odd_Even_1
{
    public  void a()
    {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the number to test");
        int num= sr.nextInt();
        //ternary operator to check number
        System.out.println(num %2==0? "Even " : "Odd");
        sr.close();
    }
    public static void main(String[] args)
    {
        Question_Odd_Even_1 q1 =new Question_Odd_Even_1();
        q1.a();
        System.out.println();

    }

}

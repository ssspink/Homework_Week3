package homeWork_Java_3;
/**Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 “ZERO”
 *  *
 */

import java.util.Scanner;

public class Question_Positive_16
{
    public void a() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number:  ");
        int n = in.nextInt();

        if (n > 0) {
            System.out.println("Number is positive");
        } else if (n < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
    public static void main(String[] args)
    {
        Question_Positive_16 q1 =new Question_Positive_16();
        q1.a();
    }

}

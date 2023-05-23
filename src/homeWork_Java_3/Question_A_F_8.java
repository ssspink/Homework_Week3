package homeWork_Java_3;
/**Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 any other alphabet should be invalid entry
 * */

import java.util.Scanner;
public class Question_A_F_8
{
    public void g()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Uppercase Alphabet :");
        String af = sc.next();
        sc.close();
        if (af.equals("A")) {
            System.out.println("Ahmedabad");
        } else if (af.equals("B")) {
            System.out.println("Berlin");
        } else if (af.equals("C")) {
            System.out.println("Char");
        } else if (af.equals("D")) {
            System.out.println("Delhi");
        } else if (af.equals("E")) {
            System.out.println("Edinburge");
        } else if (af.equals("F")) {
            System.out.println("France");
        } else {
            System.out.println("Invalid Alphabet");
        }
    }

    public static void main(String[] args)
    {
        Question_A_F_8 q2 = new Question_A_F_8();
        q2.g();
    }
}

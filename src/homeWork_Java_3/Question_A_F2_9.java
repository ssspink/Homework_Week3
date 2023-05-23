package homeWork_Java_3;

import java.util.Scanner;

/**Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 any other alphabet should be invalid entry
 *
 */
public class Question_A_F2_9
{

    public void a()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Uppercase Alphabet :");
        String af = sc.next();
        sc.close();
        switch (af){
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Berlin");
                break;
            case "C":
                System.out.println("Char");
                break;
            case "D":
                System.out.println("Dover");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Farnborough");
                break;
            default:
                System.out.println("Invalid Alphabet");
        }
    }
    public static void main(String[] args)
    {
        Question_A_F2_9 q1 =new Question_A_F2_9();
        q1.a();

    }

}

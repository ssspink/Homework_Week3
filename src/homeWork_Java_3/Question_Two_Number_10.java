package homeWork_Java_3;
/**Write a java program to input any two number and ask user to enter their symbol (+, -,
 /, *) find addition, Subtraction, multiplication and division according to their symbol
 (using if else)
 *
 */

import java.util.Scanner;

public class Question_Two_Number_10
{
    public  void solve() {
        Scanner sc = new Scanner(System.in);
        System.out.print(
                "Enter the first and the Second number - ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // selecting the operand for the calculations
        System.out.print(
                "Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");
        char op = sc.next().charAt(0);
        //solve(a, b, op);
        int ans = 0;
        // addition
        if (op == '+') {
            ans = a + b;
            // subtraction
        } else if (op == '-') {
            ans = a - b;
            // multiplication
        } else if (op == '*') {
            ans = a * b;
            // modulo
        } else if (op == '%') {
            ans = a % b;
            // division
        } else if (op == '/') {
            ans = a / b;
        }

        // printing the final result
        System.out.println("Your answer is - " + ans);
        //return ans;
    }

    public static void main(String[] args)
    {
        Question_Two_Number_10 q1 =new Question_Two_Number_10();
        q1.solve();

    }
}

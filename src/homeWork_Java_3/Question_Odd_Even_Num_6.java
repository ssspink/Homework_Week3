package homeWork_Java_3;

import java.util.Scanner;

/**Write a java program to input any number and find out if it’s odd or even
 *
 */
public class Question_Odd_Even_Num_6
{
    public void oddEven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int y= sc.nextInt();
        if (y % 2 == 0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Question_Odd_Even_Num_6 q1 =new Question_Odd_Even_Num_6();
        q1.oddEven();

    }

}

package homeWork_Java_3;
/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 *  */

import java.util.Scanner;

public class Question_Symbol_12
{
    public void h()
    {
        Scanner sr =new Scanner(System.in);
        System.out.println("Enter any character:  " );
        char ch = sr.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is A ALPHABET.");
        } else if(ch >= '0' && ch <= '9') {
            System.out.println(ch + " is A DIGIT.");
        } else {
            System.out.println(ch + " is A SPECIAL CHARACTER.");
        }

    }

    public static void main(String[] args)
    {
        Question_Symbol_12 q1 =new Question_Symbol_12();
        q1.h();
    }

 }

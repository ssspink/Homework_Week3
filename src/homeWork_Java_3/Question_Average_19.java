package homeWork_Java_3;

import java.util.Scanner;

/**Write a Java program to calculate the average value of array elements. *
 * */
public class Question_Average_19
{

    public void p()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required size of the array : ");
        int size = sc.nextInt();
        int mya[] = new int [size];
        int sum=0;
        int ave = 0;
        System.out.println("Enter the elements of the array one by one ");

        for(int i=0; i<size; i++){
            mya[i] = sc.nextInt();
            sum = sum + mya[i];
            ave = sum/size;

        }
     sc.close();
        System.out.println(" The average of the arrays" +  ave);
    }
    public static void main(String[] args)
    {
        Question_Average_19 q2 =new Question_Average_19();
        q2.p();
    }
}

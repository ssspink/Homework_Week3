package homeWork_Java_3;
/**
 *Write a Java program to sort a numeric array and a string array. *
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Numeric_Array_17
{
    public void k()
    {

        Scanner scanner = new Scanner(System.in);

        // Input numeric array
        System.out.print("Enter the number of elements in the numeric array: ");
        int numSize = scanner.nextInt();
        int[] numericArray = new int[numSize];
        System.out.println("Enter the elements of the numeric array:");
        for (int i = 0; i < numSize; i++) {
            numericArray[i] = scanner.nextInt();
        }

        // Input string array
        System.out.print("Enter the number of elements in the string array: ");
        int strSize = scanner.nextInt();
        String[] stringArray = new String[strSize];
        System.out.println("Enter the elements of the string array:");
        for (int i = 0; i < strSize; i++) {
            stringArray[i] = scanner.next();
        }

        scanner.close();

        // Sort numeric array
        sortNumericArray(numericArray);

        // Sort string array
        sortStringArrays (stringArray);
        // Print sorted numeric array

        System.out.println("Sorted Numeric Array:");
        for (int num : numericArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print sorted string array
        System.out.println("Sorted String Array:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void sortNumericArray(int[] array) {
        Arrays.sort(array);
    }
    public static void sortStringArrays(String[] array){
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        Numeric_Array_17 n1 =new Numeric_Array_17();
        n1.k();
    }

}

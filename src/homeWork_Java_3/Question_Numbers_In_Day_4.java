package homeWork_Java_3;
/**Write a method isLeapYear with a parameter of type int named year.
 The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 If the parameter is not in that range return false.
 Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 otherwise return false*
 *  *
 */

public class Question_Numbers_In_Day_4
{
    public static void isLeapYear(int year) {
        if (year < 1 && year > 9999) {
            System.out.println("false");
        } else if ((year >= 1 && year <= 9999) && (year % 400 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public  static void getDaysInMonth(int month, int year){
        if((month<1 || month>12)  ||  (year<1 || year>9999)){
            System.out.println("-1");
        }else{
            switch (month) {
                case 2:
                    if ((year >= 1 && year <= 9999) && (year % 400 == 0)) {
                        System.out.println("28");
                    }
                    else {
                        System.out.println("29");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                    break;
                default:
                    System.out.println("31");
            }
        }

    }

        public static void main (String[]args)
        {
            isLeapYear(1600);
            getDaysInMonth(05,2023);

        }


}
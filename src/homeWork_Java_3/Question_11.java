package homeWork_Java_3;

/**Write a java program to print the numbers between 1 to 100 which can be divided by 3
 and 5 separately
 *
 *
 */
public class Question_11
{
  public void divided()
  {
      System.out.println("Number Divisible by 3 : ");
      for (int x = 1; x < 100; x++)
      {
          if (x % 3 == 0)
          {
              System.out.print(+x + ",");
          }
      }
  }
    public void diVi5(){
        System.out.println("Numbers Divisible by 5 : ");
        for (int x = 1; x < 100; x++)
        {
            if (x % 5 == 0)
            {
                System.out.print(+x + ",");
            }
        }
    }

    public static void main(String[] args)
    {
        Question_11 q1 =new Question_11();
        q1.diVi5();
    }
}

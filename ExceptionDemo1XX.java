import java.util.*;
class ExceptionDemo1XX
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int no1 = 0,no2 = 0, ans = 0;

        try
        {

            System.out.println("Enter First Number :");
            no1 = sobj.nextInt();

            System.out.println("Enter Second Number :");
            no2 = sobj.nextInt();

            ans =  no1 / no2;              //Exception prone code
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Exception occured : "+aobj);
        }
        catch(Exception eobj)
        {
            System.out.println("inside generic catch");
        }
        finally
        {
            System.out.println("inside finally block");
        }
        System.out.println("Division is : "+ans);
    }
}
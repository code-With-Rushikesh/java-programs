import java.util.*;


class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {
        super(str);
    }
}
class ExceptionDemo4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Age = 0;

        System.out.println("Enter your Age : ");
        Age = sobj.nextInt();
        try
        {
            if(Age < 18)
            {
                throw new AgeInvalid("Your are under Age");
            }
            else
            {
                System.out.println("Welcome to --------");
            }
        }
        catch(AgeInvalid aobj)
        {
            System.out.println("Exception occured due to age ");
        }
        
    }
}
import java.util.*;
class ExceptionDemo2X
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {11,21,51,101,111};
        int index = 0;

        try
        {
        System.out.println("Enter The index :");
        index = sobj.nextInt();

        
        System.out.println("Element is : "+Arr[index]);
        }
        catch(ArryIndexOutOfBoundsException aobj)
        {
            System.out.println("inside catch : "+aobj);
        }
        System.out.println("End of main");
    }
}
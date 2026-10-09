class Demo 
{
    public Demo()
    {
        System.out.println("inside defualt constructor");

    }

    public Demo(int i, int j)
    {
        System.out.println("inside parameterised constructor");
        
    }
}


class Constructors_Demo                             //same as class name in cmd command prompt 
{
    public static void main (String A[])
    {
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo(11,21);

    }
}
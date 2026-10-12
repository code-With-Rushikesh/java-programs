class CopyConstructor
{
    int id;

    CopyConstructor(int i) 
    {
        id = i;
    }

    CopyConstructor(CopyConstructor s) 
    {
        id = s.id;
    }

    public static void main(String A[] ) 
    {
        CopyConstructor s1 = new CopyConstructor(101);
        CopyConstructor s2 = new CopyConstructor(s1);

        System.out.println(s1.id);
        System.out.println(s2.id);
    }
}
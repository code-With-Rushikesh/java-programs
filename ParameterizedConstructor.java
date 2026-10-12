class ParameterizedConstructor
 {
        int id;
        String name;

        ParameterizedConstructor(int i, String n) 
        {
            id = i;
            name = n;
        }

        void display() {
            System.out.println(id);
            System.out.println(name);
        }

        public static void main(String A[])
        {
            ParameterizedConstructor s = new ParameterizedConstructor(101, "Rahul");
            s.display();
        }
    }
    class ParameterizedConstructor 
    {
        int id;
        String name;

        ParameterizedConstructor(int i, String n)
        {
            id = i;
            name = n;
        }

        void display() 
        {
            System.out.println(id);
            System.out.println(name);
        }

        public static void main(String A[] )
        {
            ParameterizedConstructor s = new ParameterizedConstructor(101, "Rahul");
            s.display();
        }
}
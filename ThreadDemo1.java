class ThreadDemo1
{
    public static void main(String A[])
    {
        System.out.println("inside main");

        Thread t = Thread.currentThread();
        System.out.println( "current thread name is : "+t.getName());

        System.out.println("current thread is TID is :"+t.getId());

        System.out.println("thread is alive or not :"+t.isAlive());

        System.out.println("thread priority is :"+t.getPriority());
    }
}
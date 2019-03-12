public class NewThreadSubclass extends Thread
{
    public void run()
    {
        System.out.println("Hello Thread");
    }

    public static void main(String[] args)
    {
        NewThreadSubclass newThread = new NewThreadSubclass();

        newThread.start();
    }
}
